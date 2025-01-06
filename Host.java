package weddingplanner;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Host extends User implements Serializable{
    
    private String contact;
    private String email;
    private LocalDate doe;

    public Host() {
    }

    public Host(String name,String contact, String email, LocalDate doe) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.doe = doe;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDoe() {
        return doe;
    }

    public void setDoe(LocalDate doe) {
        this.doe = doe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Host{" + " name=" + name +", doe=" + doe +  '}';
    }
    
    
    
    

    
    
    
}
