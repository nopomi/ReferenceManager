/*
 * Kirjaviite.
 */
package deadline.referencemanager;

import java.util.ArrayList;

/**
 *
 * @author Katri Roos Deadline
 */
public class BookReference {
    
    ArrayList<Author> authors;
    /*
    private String authorFirstName;
    private String authorSuffix;
    private String auhorLastName;
    */
    private String type;
    private String editor;
    private String editorAddress;
    private String title;
    private String publisher;
    private String publisherAddress;
    private int year;
    private String volume;
    private String number;
    private String serier;
    private String edition;
    private String month;
    
    //Mahdollisesti useat authorit talletetaan Author-olioina ArrayListiin.
    public BookReference(ArrayList<Author> authors, String editor, 
            String editorAddress, String title, String publisher, 
            String publisherAddress, int year, String volume, String number, 
            String serier, String edition, String month)  {
        
        this.authors = authors;
        this.type = "book";
        this.editor = editor;
        this.editorAddress = editorAddress;
        this.title = title;
        this.publisher = publisher;
        this.publisherAddress = publisherAddress;
        this.year = year;
        this.volume = volume;
        this.number = number;
        this.serier = serier;
        this.edition = edition;
        this.month = month;
    }
    
    /**
     * @return the authors
     */
    public ArrayList getAuthors() {
        
        return this.authors;
    }   
    
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    /**
     * @return the editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @return the editorAddress
     */
    public String getEditorAddress() {
        return editorAddress;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }
    
    /**
     * @return the publisherAddress
     */
    public String getPublisherAddress() {
        return publisherAddress;
    }


    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return the serier
     */
    public String getSerier() {
        return serier;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }
    
    /**
     * @param author the Author object to set in authors ArrayList
     */
    public void setAuthors(Author author) {
        
        this.authors.add(author);
    }

        
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param editor the editor to set
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * @param editorAddress the editorAddress to set
     */
    public void setEditorAddress(String editorAddress) {
        this.editorAddress = editorAddress;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    /**
     * @param publisherAddress the publisherAddress to set
     */
    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @param serier the serier to set
     */
    public void setSerier(String serier) {
        this.serier = serier;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }
    
    public String ToString()    {
       
        return "Authors: " + getAuthors().toString() + "\n" 
                + "Editor: " + getEditor() + ", " + getEditorAddress() + "\n"
                + "Title: " + getTitle() + "\n"
                + "Publisher: " + getPublisher() + ", " + getPublisherAddress() + "\n" 
                + "Year: " + getYear() + "\n"
                + "Volume: " + getVolume() + "\n"
                + "Number: " + getNumber() + "\n"
                + "Serier: " + getSerier() + "\n"
                + "Edition: " + getEdition() + "\n"
                + "Month: " + getMonth();
    }
}
