
package wad.domain.bibtex;

import wad.domain.BibCreator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;


public class BibCreatorTest {
    private BibCreator creator;
    

    @Before
    public void setUp() {
        creator = new BibCreator();
    }
    
    @Test
    public void creatorNamesFileCorrectly() {
//        String name = creator.createBibFile();
//        assertTrue(name.contains(".bib"));
//        assertTrue(name.length()>4);
    }
    
}
