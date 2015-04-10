
package rm.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class Reference {
    
    @Column
    private String text;
    
    @Id
    private long id;
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    }
