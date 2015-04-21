package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PhdthesisReferenceTest {
    
    private PhdthesisReference reference;
    
    @Before
    public void setUp() {
        reference = new PhdthesisReference();
    }
    
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.PHDTHESIS);
        assertEquals(reference.getType(), ReferenceType.PHDTHESIS);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setSchool("Monster High");
        assertEquals(reference.getSchool(), "Monster High");
        
        reference.setYear(2014);
        assertEquals(reference.getYear(), 2014);
        
        reference.setPhdthesistype("Dissertation");
        assertEquals(reference.getPhdthesistype(), "Dissertation");
        
        reference.setAddress("DowningStreet");
        assertEquals(reference.getAddress(), "DowningStreet");
                
        reference.setMonth("august");
        assertEquals(reference.getMonth(), "august");   
        
        reference.setNote("note");
        assertEquals(reference.getNote(), "note");
        
        reference.setKey("avain");
        assertEquals(reference.getKey(), "avain");
    } 
}
