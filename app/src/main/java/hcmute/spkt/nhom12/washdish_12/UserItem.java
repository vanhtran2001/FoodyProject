package hcmute.spkt.nhom12.washdish_12;

import java.io.Serializable;

public class UserItem implements Serializable {
    private int id;
    private String email;
    private String password;
    private String fname;
    private String phone;
    private String adrs;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdrs() {
        return adrs;
    }

    public void setAdrs(String adrs) {
        this.adrs = adrs;
    }
}
