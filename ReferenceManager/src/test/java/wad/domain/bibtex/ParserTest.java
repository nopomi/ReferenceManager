package wad.domain.bibtex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
import wad.domain.ReferenceType;

public class ParserTest {

    private Parser parser;
    private ArticleReference aRef;
    private BookReference bRef;
    private InproceedingsReference iRef;

    @Before
    public void setUp() {
        parser = new Parser();
        aRef = new ArticleReference();
        bRef = new BookReference();
        iRef = new InproceedingsReference();
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

}
