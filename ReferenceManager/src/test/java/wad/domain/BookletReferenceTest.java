package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookletReferenceTest {
    
    private BookletReference reference;
    
    @Before
    public void setUp() {
        reference = new BookletReference();
    }
    
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.BOOKLET);
        assertEquals(reference.getType(), ReferenceType.BOOKLET);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setHowpublished("Online");
        assertEquals(reference.getHowpublished(), "Online");
        
        reference.setAddress("DowningStreet");
        assertEquals(reference.getAddress(), "DowningStreet");
        
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
