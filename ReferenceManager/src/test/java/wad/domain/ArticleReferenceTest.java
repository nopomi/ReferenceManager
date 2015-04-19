
package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArticleReferenceTest {
    
    private ArticleReference reference;
    
    @Before
    public void setUp(){
       reference = new ArticleReference();
    }

    @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.ARTICLE);
        assertEquals(reference.getType(), ReferenceType.ARTICLE);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setTitle("Book of Greatness");
        assertEquals(reference.getTitle(), "Book of Greatness");
        
        reference.setYear(2014);
        assertEquals(reference.getYear(), 2014);
        
        reference.setJournal("Journal");
        assertEquals(reference.getJournal(), "Journal");
        
        reference.setVolume("3rd");
        assertEquals(reference.getVolume(), "3rd");
        
        reference.setNumber("derp");
        assertEquals(reference.getNumber(), "derp");
        
        reference.setPages("200-300");
        assertEquals(reference.getPages(), "200-300");
        
        reference.setMonth("august");
        assertEquals(reference.getMonth(), "august");
        
        reference.setNote("note");
        assertEquals(reference.getNote(), "note");
        
        reference.setKey("avain");
        assertEquals(reference.getKey(), "avain");
    } 

    
}
