package com.example.navadon.androidnamecard;

public class ActivityInfoView {
    private String titlePhoneNum;
    private String phoneNum;
    private String titleEmail;
    private String email;
    private String titleAddr;
    private String addr;

    public ActivityInfoView(){
        titlePhoneNum = "";
        phoneNum = "";
        titleEmail = "";
        email = "";
        titleAddr = "";
        addr = "";
    }

    public String getTitlePhoneNum() {
        return titlePhoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getTitleEmail() {
        return titleEmail;
    }

    public String getEmail() {
        return email;
    }

    public String getTitleAddr() {
        return titleAddr;
    }

    public String getAddr() {
        return addr;
    }

    public void setTitlePhoneNum(String titlePhoneNum) {
        this.titlePhoneNum = titlePhoneNum;
    }

    public void setPhonenum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setTitleEmail(String titleEmail) {
        this.titleEmail = titleEmail;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitleAddr(String titleAddr) {
        this.titleAddr = titleAddr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}
