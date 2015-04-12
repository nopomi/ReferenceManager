import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import wad.domain.Reference;

public class ReferenceTest {

    Reference reference;
    String text;

    @Before
    public void setUp() {
        reference = new Reference();
        text = "@article{small,\n"
                + "author = {Freely, I.P.},\n"
                + "title = {A small paper},\n"
                + "journal = {The journal of small papers},\n"
                + "year = 1997,\n"
                + "volume = {-1},\n"
                + "note = {to appear},\n"
                + "}\n"
                + "\n"
                + "@article{big,\n"
                + "author = {Jass, Hugh},\n"
                + "title = {A big paper},\n"
                + "journal = {The journal of big papers},\n"
                + "year = 7991,\n"
                + "volume = {MCMXCVII},\n"
                + "}";
    }

    @Test
    public void constructorCreatesInstanceOfClass() {
        assertFalse(reference == null);
    }
    
    @Test
    public void constructorDoesNotCreateReferenceInConstructor(){
        assertNull(reference.getReference());
    }
    
    @Test
    public void ableToSetNewId(){
        reference.setRefId("123123");
        assertEquals(reference.getRefId(), "123123");
    }

    @Test
    public void setterSetsText() {
        reference.setReference(text);
        assertEquals(text, reference.getReference());
    }
    
    
    @Test
    public void setterCanChangeText(){
        reference.setReference(text);
        String alternativeText = "alternative text";
        reference.setReference(alternativeText);
        assertEquals(alternativeText, reference.getReference());
    }


}
