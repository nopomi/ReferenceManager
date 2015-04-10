/*
 * Author.
 */
package deadline.referencemanager;

/**
 *
 * @author Katri Roos Deadline
 */
public class Author {
    
    private String firstname;
    private String suffix;
    private String lastname;
    
    public Author(String firstname, String suffix, String lastname) {
        
        this.firstname = firstname;
        this.suffix = suffix;
        this.lastname = lastname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    @Override
    public String toString()    {
        
        return getLastname() + ", " + getFirstname() + ", " + getSuffix() + " ";
    }
}
