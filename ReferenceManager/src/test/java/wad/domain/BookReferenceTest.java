
package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookReferenceTest {
    
    private BookReference reference;
    
    @Before
    public void setUp() {
        reference = new BookReference();
    }
    
        @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.BOOK);
        assertEquals(reference.getType(), ReferenceType.BOOK);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setYear(2014);
        assertEquals(reference.getYear(), 2014);
        
        reference.setPublisher("Pearson");
        assertEquals(reference.getPublisher(), "Pearson");
        
        reference.setVolume("3rd");
        assertEquals(reference.getVolume(), "3rd");
        
        reference.setSeries("Series");
        assertEquals(reference.getSeries(), "Series");
        
        reference.setAddress("DowningStreet");
        assertEquals(reference.getAddress(), "DowningStreet");
        
        reference.setEdition("3rd");
        assertEquals(reference.getEdition(), "3rd");
        
        reference.setMonth("august");
        assertEquals(reference.getMonth(), "august");
        
        reference.setNote("note");
        assertEquals(reference.getNote(), "note");
        
        reference.setKey("avain");
        assertEquals(reference.getKey(), "avain");
    } 
    
    
}
