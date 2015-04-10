package deadline.referencemanager;

import deadline.tietokanta.Kyselyt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws SQLException {

        //Laitetaan uusi kirja-viite tietokantaan ja tulostetaan.
        Kyselyt k = new Kyselyt();
        
        ArrayList<Author> list = new ArrayList<Author>();
        list.add(new Author("Beck", null, "Kent"));
        list.add(new Author("Andres", null, "Cynthia"));
        
        BookReference br = new BookReference(list, null, 
                null, "Extreme Programming Explained: Embrace Change", "Addison-Wesley Professional", null, 2004, null, 
                null, null, "2nd Edition", null);
        
        k.setBookReference(br);
        
        ArrayList viitteet = k.getBookReference();
        
        Iterator<BookReference> i = viitteet.iterator();
        while(i.hasNext())  {
            System.out.println(i.next().ToString());
            System.out.println("");
        }
        
    }
}
