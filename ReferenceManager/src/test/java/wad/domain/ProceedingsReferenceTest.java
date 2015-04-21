package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProceedingsReferenceTest {
    
    private ProceedingsReference reference;
    
    @Before
    public void setUp() {
        reference = new ProceedingsReference();
    }
    
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.PROCEEDINGS);
        assertEquals(reference.getType(), ReferenceType.PROCEEDINGS);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setYear(2014);
        assertEquals(reference.getYear(), 2014);
        
        reference.setEditor("Seppo");
        assertEquals(reference.getEditor(), "Seppo");
        
        reference.setVolume("3rd");
        assertEquals(reference.getVolume(), "3rd");
        
        reference.setNumber("7");
        assertEquals(reference.getNumber(), "7");
        
        reference.setSeries("Series");
        assertEquals(reference.getSeries(), "Series");
        
        reference.setAddress("DowningStreet");
        assertEquals(reference.getAddress(), "DowningStreet");
        
        reference.setMonth("august");
        assertEquals(reference.getMonth(), "august");
        
        reference.setPublisher("Pearson");
        assertEquals(reference.getPublisher(), "Pearson");
        
        reference.setOrganization("Roscosmos");
        assertEquals(reference.getOrganization(), "Roscosmos");
        
        reference.setNote("note");
        assertEquals(reference.getNote(), "note");
        
        reference.setKey("avain");
        assertEquals(reference.getKey(), "avain");
    } 
}
