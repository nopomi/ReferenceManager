/*
 * sql-kyselyt tietokantaan.
 */
package deadline.tietokanta;

import deadline.referencemanager.Author;
import deadline.referencemanager.BookReference;
import deadline.referencemanager.Main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katri Roos Deadline
 */
public class Kyselyt {
    
    Statement st, st2 = null;
    ResultSet rs,rs2 = null;
    Yhteys yhteys = null;
    Connection con = null;
    
    public Kyselyt() throws SQLException    {
        
        this.yhteys = new Yhteys();
        con = yhteys.yhteys();
        st = con.createStatement();
        st2 = con.createStatement();
    }
    
    //Avataan uudelleen yhteys jos tarvis.
    public void avaaYhteys() throws SQLException {
       
        if(con.isClosed())  {
            this.yhteys = new Yhteys();
            con = yhteys.yhteys();
            st = con.createStatement();
            st2 = con.createStatement();
        }
    }
    
    //Yhteyksien sulkeminen.
    public void suljeYhteys() throws SQLException {
        
        if (rs != null) {
                rs.close();
        }
        if (rs2 != null) {
            rs2.close();
        }
        if (st != null) {
            st.close();
        }
        if (st2 != null) {
            st2.close();
        }
        if (con != null) {
            con.close();
        }
    }
    
    //Laitetaan book-tyyppinen viite tietokantaan. Parametrinä BookReference-olio.
    public void setBookReference(BookReference br)   {
        
        try {
            
            avaaYhteys();
            
            //Lisätään kustantaja publisher-tauluun, jos ei ole jo olemassa.
            st.execute("INSERT INTO publisher (publisher, address) SELECT '" 
                    + br.getPublisher() + "', '" + br.getPublisherAddress() + "' "
                    + "WHERE NOT EXISTS (SELECT * FROM publisher WHERE publisher='" 
                        + br.getPublisher()+ "' AND address='" + br.getPublisherAddress() 
                    + "');");  
            
            //Lisätään viite-tauluun viitteen tiedot.
            st.execute("INSERT INTO viite (type, title, publisher, "
                    + "year, volume, number, serier, edition, month) "
                    + "SELECT '" + br.getType()+ "', "
                    + "'" + br.getTitle() + "', "
                    + "(SELECT publisher_id FROM publisher WHERE publisher='" + br.getPublisher() + "'), "
                    + br.getYear() + ", "
                    + "'" + br.getVolume() + "', "
                    + "'" + br.getNumber() + "', "
                    + "'" + br.getSerier() + "', "
                    + "'" + br.getEdition() + "', "
                    + "'" + br.getMonth() + "' "
                    + "WHERE NOT EXISTS (SELECT * FROM viite WHERE "
                    + "type='" + br.getType() + "' "
                    + "AND title='" + br.getTitle() + "' "
                    + "AND publisher=(SELECT publisher_id FROM publisher WHERE publisher='" + br.getPublisher() + "') "
                    + "AND year=" + br.getYear() + " "
                    + "AND volume='" + br.getVolume() + "' "
                    + "AND number='" + br.getNumber() + "' "
                    + "AND serier='" + br.getSerier() + "' "
                    + "AND edition='" + br.getEdition() + "' "
                    + "AND month='" + br.getMonth() + "');");
            
            //Kirja-viitteeseen tulee joko author (yksi tai useampi) tai editor
            //jos ei ole editoria, niin laitetaan author tauluun authorit ja authormaps-tauluun
            //yhteys viitteeseen.
            if(br.getEditor() == null)    {

                for(int i = 0; i < br.getAuthors().size(); i++) {
                    
                    Author a = (Author) br.getAuthors().get(i);
                    
                    st.execute("INSERT INTO author (firstname, suffix, lastname) "
                        + "SELECT '" + a.getFirstname() + "', '"
                        + a.getSuffix() + "', '" + a.getLastname() + "' "
                        + "WHERE NOT EXISTS (SELECT * from author WHERE firstname='" 
                        + a.getFirstname() + "' AND suffix='" + a.getSuffix() + "' AND "
                        + "lastname='" + a.getLastname() + "');");
                   
                    //Laitetaan authormaps-tauluun viite viite-tauluun ja author-tauluun.
                    st.execute("INSERT INTO authormaps (author_id, viite_id) "
                        + "SELECT (SELECT author_id FROM author WHERE lastname='" + a.getLastname() + "'), "
                            + "(SELECT viite_id FROM viite WHERE "
                            + "type='" + br.getType() + "' "
                            + "AND title='" + br.getTitle() + "' "
                            + "AND publisher=(SELECT publisher_id FROM publisher WHERE publisher='" + br.getPublisher() + "') "
                            + "AND year=" + br.getYear() + " "
                            + "AND volume='" + br.getVolume() + "' "
                            + "AND number='" + br.getNumber() + "' "
                            + "AND serier='" + br.getSerier() + "' "
                            + "AND edition='" + br.getEdition() + "' "
                            + "AND month='" + br.getMonth() + "') "
                            + "WHERE NOT EXISTS (SELECT * FROM authormaps WHERE "
                            + "author_id=(SELECT author_id FROM author WHERE lastname='" + a.getLastname() + "') "
                            + "AND viite_id=(SELECT viite_id FROM viite WHERE "
                            + "type='" + br.getType() + "' "
                            + "AND title='" + br.getTitle() + "' "
                            + "AND publisher=(SELECT publisher_id FROM publisher WHERE publisher='" + br.getPublisher() + "') "
                            + "AND year=" + br.getYear() + " "
                            + "AND volume='" + br.getVolume() + "' "
                            + "AND number='" + br.getNumber() + "' "
                            + "AND serier='" + br.getSerier() + "' "
                            + "AND edition='" + br.getEdition() + "' "
                            + "AND month='" + br.getMonth() + "'));");
                    
		}
                
            }
            else    {

                //Lisätään editor editor-tauluun, jos ei ole jo olemassa.
                st.execute("INSERT INTO editor (editor, address) "
                        + "SELECT '" + br.getEditor() + "', '" 
                        + br.getEditorAddress() + "' "
                        + "WHERE NOT EXISTS (SELECT * FROM editor WHERE editor='" 
                        + br.getEditor()+ "' AND address='" + br.getEditorAddress()
                        + "');");

            }              
        
            //Lisätään viite-tauluun editori.
            st.execute("UPDATE viite SET editor=(SELECT editor_id FROM editor WHERE editor='" + br.getEditor() + "')");
        
        } catch (SQLException ex) {
                Logger.getLogger(Kyselyt.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
            try {
                
                suljeYhteys();
                
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(Main.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
      
    }
    
    //Haetaan kaikki book-tyyppiset viitteet tietokannasta.
    public ArrayList<BookReference> getBookReference()   {
        
        //ArrayList authoreita varten.
        ArrayList<Author> authors = new ArrayList<Author>();
        //ArrayList book-viitteitä varten.
        ArrayList<BookReference> lista = new ArrayList<BookReference>();
        
        try {
            
            avaaYhteys();
            
            //Haetaan kaikki tyypin book viitteet.
            rs = st.executeQuery("SELECT * FROM viite WHERE type='book'");
                       
            while(rs.next())    {
                
                //Haetaan viiteeseen liittyvät authorit.
                rs2 = st2.executeQuery("SELECT * FROM author WHERE author_id IN "
                        + "(SELECT author_id FROM authormaps WHERE viite_id=" + rs.getInt("viite_id") + ");");
                
                //Lisätään authorit ArrayListiin.
                while(rs2.next()) {
                    
                    authors.add(new Author(rs2.getString("Firstname"), rs2.getString("suffix"), rs2.getString("Lastname")));
                }
                
                //Luodaan uusi kirjaviiteolio.
                BookReference br = new BookReference(authors, null, null, rs.getString("title"), 
                        null, null, rs.getInt("year"), rs.getString("volume"), 
                        rs.getString("number"), rs.getString("serier"), rs.getString("edition"), 
                        rs.getString("month"));
                
                //Jos viitteessä on editor, niin haetaan tiedot editor-taulusta.
                if(rs.getInt("editor") != 0)    {
                
                    rs2 = st2.executeQuery("SELECT * FROM editor "
                    + "WHERE editor_id=" + rs.getInt("editor") + ";");
                
                    rs2.next();

                    br.setEditor(rs2.getString("editor"));
                    br.setEditorAddress(rs2.getString("address"));
                }
                            
                //Lisätään viiteolio listaan.
                lista.add(br);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Kyselyt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                
                suljeYhteys();

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(Main.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
        
        return lista;
    }
    
}
