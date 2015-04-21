package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IncollectionReferenceTest {
    
    private IncollectionReference reference;
    
    @Before
    public void setUp() {
        reference = new IncollectionReference();
    }
   
    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.INCOLLECTION);
        assertEquals(reference.getType(), ReferenceType.INCOLLECTION);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setBooktitle("Great adventures of Spok");
        assertEquals(reference.getBooktitle(), "Great adventures of Spok");
        
        reference.setPublisher("Pearson");
        assertEquals(reference.getPublisher(), "Pearson");
        
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
        
        reference.setIncollectiontype("Research Note");
        assertEquals(reference.getIncollectiontype(), "Research Note");
        
        reference.setChapter("3");
        assertEquals(reference.getChapter(), "3");
        
        reference.setPages("7-8");
        assertEquals(reference.getPages(), "7-8");
        
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
