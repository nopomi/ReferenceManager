
package rm.repository;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import rm.domain.Reference;

public class ReferenceRepositoryTest {
    
    @Autowired
    ReferenceRepository rr;
    Reference r;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r = new Reference();
        r.setText("test");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void addRefereence() {
        long id = 1;
        r.setId(id);
        rr.save(r);
        assertEquals(1, rr.findAll().size());
    }
}
