/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class InproceedingsReferenceTest {
    
        private InproceedingsReference reference;
    
    @Before
    public void setUp() {
        reference = new InproceedingsReference();
    }
    
        @Test
    public void gettersAndSettersWork() {
        reference.setType(ReferenceType.INPROCEEDINGS);
        assertEquals(reference.getType(), ReferenceType.INPROCEEDINGS);
        
        reference.setLabel("KRD13");
        assertEquals(reference.getLabel(), "KRD13");
        
        reference.setAuthor("Keijo");
        assertEquals(reference.getAuthor(), "Keijo");
        
        reference.setEditor("Keijon kaveri");
        assertEquals(reference.getEditor(), "Keijon kaveri");
        
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
        
        reference.setPages("200-300");
        assertEquals(reference.getPages(), "200-300");
        
        reference.setAddress("DowningStreet");
        assertEquals(reference.getAddress(), "DowningStreet");
        
        reference.setOrganization("ABB");
        assertEquals(reference.getOrganization(), "ABB");
        
        reference.setMonth("august");
        assertEquals(reference.getMonth(), "august");
        
        reference.setNote("note");
        assertEquals(reference.getNote(), "note");
        
        reference.setKey("avain");
        assertEquals(reference.getKey(), "avain");
    } 
    
}
