
package weddingplanner;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author rafia
 */
public class Account {
    private SimpleStringProperty accountName,gmail;
    private int accountId,contactInfo;

    public Account(int accountId, int contactInfo) {
        this.accountId=0;
        this.contactInfo=0;
    }

    public Account(String accountName, String gmail,int accountId, int contactInfo){
                        this.accountName=new SimpleStringProperty(accountName);
                        this.gmail=new SimpleStringProperty(gmail);
                        this.accountId= accountId;
                        this.contactInfo=contactInfo;
        
    }

    public String getAccountName() {
        return accountName.get();
    }

    public void setAccountName(String accountName) {
        this.accountName =new SimpleStringProperty (accountName);
    }

    public String getGmail() {
        return gmail.get();
    }

    public void setGmail(String gmail) {
        this.gmail =new SimpleStringProperty(gmail);
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Account{" + "accountId=" + accountId + ", contactInfo=" + contactInfo + '}';
    }
    
    
    
}
