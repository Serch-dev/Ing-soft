package amazon;

import java.io.Serializable;

public class Account implements Serializable{
    
    private String nameAccount;
    private String userNameAccount;
    private String phoneAccount;
    private String countryAccount;
    private String emailAccount;
    private String passwordAccount;
    private int tipeAccount;

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getUserNameAccount() {
        return userNameAccount;
    }

    public void setUserNameAccount(String userNameAccount) {
        this.userNameAccount = userNameAccount;
    }

    public String getPhoneAccount() {
        return phoneAccount;
    }

    public void setPhoneAccount(String phoneAccount) {
        this.phoneAccount = phoneAccount;
    }

    public String getCountryAccount() {
        return countryAccount;
    }

    public void setCountryAccount(String countryAccount) {
        this.countryAccount = countryAccount;
    }

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
    }

    public String getPasswordAccount() {
        return passwordAccount;
    }

    public void setPasswordAccount(String passwordAccount) {
        this.passwordAccount = passwordAccount;
    }

    public int getTipeAccount() {
        return tipeAccount;
    }

    public void setTipeAccount(int tipeAccount) {
        this.tipeAccount = tipeAccount;
    }
        
}
