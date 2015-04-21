package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MastersthesisReferenceTest {
    
    private MastersthesisReference reference;
    
    @Before
    public void setUp() {
        reference = new MastersthesisReference();
    }
    
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.MASTERSTHESIS);
        assertEquals(reference.getType(), ReferenceType.MASTERSTHESIS);
        
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
        
        reference.setMastersthesistype("Dissertation");
        assertEquals(reference.getMastersthesistype(), "Dissertation");
        
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
