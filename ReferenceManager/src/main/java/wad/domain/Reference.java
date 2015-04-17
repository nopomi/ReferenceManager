package wad.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Reference extends AbstractPersistable<Long> {

    private ReferenceType type;
    private String label;
    private String author;
    private String title;
    private int year;

    public String getRefId() {
        return label;
    }

    public void setRefId(String label) {
        this.label = label;
    }

    public String getReference() {
        return author;
    }

    public void setReference(String author) {
        this.author = author;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ReferenceType getType() {
        return type;
    }

    public void setType(ReferenceType type) {
        this.type = type;
    }
   
}
