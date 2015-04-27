package wad.domain.bibtex;

import wad.domain.Parser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.BookletReference;
import wad.domain.ConferenceReference;
import wad.domain.IncollectionReference;
import wad.domain.InproceedingsReference;
import wad.domain.ReferenceType;

public class ParserTest {

    private Parser parser;
    private ArticleReference aRef;
    private BookReference bRef;
    private InproceedingsReference iRef;
    private ConferenceReference cRef;
    private IncollectionReference icolRef;
    private BookletReference bletRef;

    @Before
    public void setUp() {
        parser = new Parser();
        aRef = new ArticleReference();
        bRef = new BookReference();
        iRef = new InproceedingsReference();
        cRef = new ConferenceReference();
        icolRef = new IncollectionReference();
        bletRef = new BookletReference();

    }

    @Test
    public void articleParserWorks() {
        aRef.setType(ReferenceType.ARTICLE);
        aRef.setLabel("KRD13");
        aRef.setAuthor("Keijo");
        aRef.setTitle("Book of Greatness");
        aRef.setYear(2014);
        aRef.setJournal("Journal");
        aRef.setVolume("3rd");
        aRef.setNumber("derp");
        aRef.setPages("200-300");
        aRef.setMonth("august");
        aRef.setNote("note");
        aRef.setKey("avain");

        String reference = parser.createBibTexString(aRef);
        assertTrue(reference.contains("@article"));
        assertTrue(reference.contains("KRD13"));
        assertTrue(reference.contains("Keijo"));
        assertTrue(reference.contains("Book of Greatness"));
        assertTrue(reference.contains("key ="));

    }

    @Test
    public void bookParserWorks() {
        bRef.setType(ReferenceType.BOOK);
        bRef.setLabel("KRD13");
        bRef.setAuthor("Keijo");
        bRef.setTitle("Book of Greatness");
        bRef.setYear(2014);
        bRef.setPublisher("Pearson");
        bRef.setVolume("3rd");
        bRef.setSeries("Series");
        bRef.setAddress("DowningStreet");
        bRef.setEdition("3rd");
        bRef.setMonth("august");
        bRef.setNote("note");
        bRef.setKey("avain");

        String reference = parser.createBibTexString(bRef);

        assertTrue(reference.contains("@book"));
        assertTrue(reference.contains("KRD13"));
        assertTrue(reference.contains("Keijo"));
        assertTrue(reference.contains("Book of Greatness"));
        assertTrue(reference.contains("key ="));
    }

    @Test
    public void inproceedingsParserWorks() {

        iRef.setType(ReferenceType.INPROCEEDINGS);
        iRef.setLabel("KRD13");
        iRef.setAuthor("Keijo");
        iRef.setEditor("Keijon kaveri");
        iRef.setTitle("Book of Greatness");
        iRef.setYear(2014);
        iRef.setPublisher("Pearson");
        iRef.setVolume("3rd");
        iRef.setSeries("Series");
        iRef.setPages("200-300");
        iRef.setAddress("DowningStreet");
        iRef.setOrganization("ABB");
        iRef.setMonth("august");
        iRef.setNote("note");
        iRef.setKey("avain");

        String reference = parser.createBibTexString(iRef);
        assertTrue(reference.contains("@inproceedings"));
        assertTrue(reference.contains("KRD13"));
        assertTrue(reference.contains("Keijo"));
        assertTrue(reference.contains("Book of Greatness"));
        assertTrue(reference.contains("key ="));

    }

    @Test
    public void conferenceParserWorks() {
        cRef.setType(ReferenceType.CONFERENCE);
        cRef.setAddress("address");
        cRef.setAuthor("author");
        cRef.setEditor("editor");
        cRef.setKey("key");
        cRef.setLabel("XXX");
        cRef.setMonth("month");
        cRef.setNote("note");
        cRef.setOrganization("ABB");
        cRef.setPages("200-300");
        cRef.setPublisher("publisher");
        cRef.setSeries("series");
        cRef.setTitle("title");
        cRef.setYear(2000);

        String reference = parser.createBibTexString(cRef);
        assertTrue(reference.contains("@conference"));
        assertTrue(reference.contains("address"));
        assertTrue(reference.contains("key"));
        assertTrue(reference.contains("XXX"));
        assertTrue(reference.contains("pages"));
        assertFalse(reference.contains("volume"));

    }
    
    @Test
    public void BookletParserWorks(){
        bletRef.setType(ReferenceType.BOOKLET);
        bletRef.setAddress("address");
        bletRef.setAuthor("author");
        bletRef.setHowpublished("by_mail");
        bletRef.setKey("key");
        bletRef.setLabel("BLET");
        bletRef.setMonth("August");
        bletRef.setYear(2000);
        
        String reference = parser.createBibTexString(bletRef);
        assertTrue(reference.contains("@booklet"));
        assertFalse(reference.contains("note"));
        assertTrue(reference.contains("August"));
        assertTrue(reference.contains("2000"));
        assertTrue(reference.contains("BLET"));
        assertTrue(reference.contains("month"));
        assertTrue(reference.contains("by_mail"));
    }
    
    @Test
    public void IncollectionParserWorks(){
        icolRef.setType(ReferenceType.INCOLLECTION);
        icolRef.setBooktitle("bookTitle");
        icolRef.setAddress("address");
        icolRef.setAuthor("author");
        icolRef.setIncollectiontype("type");
        icolRef.setNumber("2");
        icolRef.setChapter("chapt");
        icolRef.setEdition("7th");
        icolRef.setEditor("Keijo");
        icolRef.setKey("key");
        icolRef.setLabel("KKD123");
        icolRef.setMonth("August");
        icolRef.setNumber("5");
        icolRef.setPages("200-300");
        icolRef.setPublisher("Pearson");
        icolRef.setSeries("series");
        icolRef.setTitle("title");
        
        String reference = parser.createBibTexString(icolRef);
        assertTrue(reference.contains("@incollection"));
        assertTrue(reference.contains("August"));
        assertFalse(reference.contains("note"));
        assertTrue(reference.contains("200-300"));
        assertTrue(reference.contains("title"));
        assertTrue(reference.contains("publisher"));
    }
}
