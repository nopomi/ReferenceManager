/*
 * Avaa yhteyden tiotokantaan.
 */
package deadline.tietokanta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katri Roos Deadline
 */
public class Yhteys {
    
    private String url = "jdbc:postgresql://localhost/kroos";
    private String user = "kroos";
    private String password = "a16c37a3e09b93b7";
    
    Connection con = null;

    public Yhteys() {
        
        try {
            this.con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Yhteys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection yhteys()  {
        
        return this.con;
    }
    
}
