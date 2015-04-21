package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TechreportReferenceTest {
    
    private TechreportReference reference;
    
    @Before
    public void setUp() {
        reference = new TechreportReference();
    }
    
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.TECHREPORT);
        assertEquals(reference.getType(), ReferenceType.TECHREPORT);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setInstitution("Royal Institution of Great Britain");
        assertEquals(reference.getInstitution(), "Royal Institution of Great Britain");
        
        reference.setYear(2014);
        assertEquals(reference.getYear(), 2014);
        
        reference.setTechreporttype("Dissertation");
        assertEquals(reference.getTechreporttype(), "Dissertation");
        
        reference.setNumber("3");
        assertEquals(reference.getNumber(), "3");
                
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
