
package rm.domain;

import javax.persistence.Column;

public class Reference {
    
    @Column
    private String text;
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
}
