package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class InbookReferenceTest {
    
    private InbookReference reference;
    
    @Before
    public void setUp() {
        reference = new InbookReference();
    }
    
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.INBOOK);
        assertEquals(reference.getType(), ReferenceType.INBOOK);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setEditor("Seppo");
        assertEquals(reference.getEditor(), "Seppo");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setChapter("4");
        assertEquals(reference.getChapter(), "4");
        
        reference.setPages("2-4");
        assertEquals(reference.getPages(), "2-4");
        
        reference.setPublisher("Pearson");
        assertEquals(reference.getPublisher(), "Pearson");
        
        reference.setYear(2014);
        assertEquals(reference.getYear(), 2014);
        
        reference.setVolume("3rd");
        assertEquals(reference.getVolume(), "3rd");
        
        reference.setNumber("7");
        assertEquals(reference.getNumber(), "7");
        
        reference.setSeries("Series");
        assertEquals(reference.getSeries(), "Series");
        
        reference.setInbooktype("Research Note");
        assertEquals(reference.getInbooktype(), "Research Note");
        
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
