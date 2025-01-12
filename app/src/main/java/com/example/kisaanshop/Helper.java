package com.example.kisaanshop;

public class Helper {

    String Uname;
    String Uemail;
    String Upassword;

    public Helper() {
    }
    public Helper(String uname, String uemail, String upassword) {
        this.Uname = uname;
        this.Uemail = uemail;
        this.Upassword = upassword;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        this.Uname = uname;
    }

    public String getUemail() {
        return Uemail;
    }

    public void setUemail(String uemail) {
        this.Uemail = uemail;
    }

    public String getUpassword() {
        return Upassword;
    }

    public void setUpassword(String upassword) {
        this.Upassword = upassword;
    }
}
