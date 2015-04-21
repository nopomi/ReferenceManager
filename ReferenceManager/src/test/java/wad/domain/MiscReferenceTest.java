package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MiscReferenceTest {
    
    private MiscReference reference;
    
    @Before
    public void setUp() {
        reference = new MiscReference();
    }
    
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.MISC);
        assertEquals(reference.getType(), ReferenceType.MISC);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setHowpublished("Online");
        assertEquals(reference.getHowpublished(), "Online");
        
        reference.setMonth("august");
        assertEquals(reference.getMonth(), "august");
        
        reference.setYear(2014);
        assertEquals(reference.getYear(), 2014);
        
        reference.setNote("note");
        assertEquals(reference.getNote(), "note");
        
        reference.setKey("avain");
        assertEquals(reference.getKey(), "avain");
    } 
}
