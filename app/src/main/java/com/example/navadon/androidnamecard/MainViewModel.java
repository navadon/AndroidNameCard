package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private String th;
    private String en;

    private String depname;
    private String myname;
    private String subname;
    private String address;

    private String depnameth;
    private String mynameth;
    private String subnameth;
    private String addressth;

    public MainViewModel(){
        this.th = "TH";
        this.en = "EN";
        this.depname = "Department of Computer Engineering";
        this.myname = "Supakarn Chaidaroon";
        this.subname = "4th year student";
        this.address = "4th Floor, 30 Years Building\nFaculty of Engineering, Chiang Mai University\nEmail: supakarn_chaidaroon@cmu.ac.th";
        this.depnameth = "ภาควิชาวิศวกรรมคอมพิวเตอร์";
        this.mynameth = "ศุภการ  ชัยดรุณ";
        this.subnameth = "นักศึกษาชั้นปีที่ 4";
        this.addressth = "ชั้น 4 อาคาร 30 ปี\nคณะวิศวกรรมศาสตร์ มหาวิทยาลัยเชียงใหม่\nอีเมล: supakarn_chaidaroon@cmu.ac.th";
    }

    public String getDepname() {
        return depname;
    }

    public String getMyname() {
        return myname;
    }

    public String getSubname() {
        return subname;
    }

    public String getAddress() {
        return address;
    }

    public String getTh() {
        return th;
    }

    public String getEn() {
        return en;
    }

    public String getDepnameth() {
        return depnameth;
    }

    public String getMynameth() {
        return mynameth;
    }

    public String getSubnameth() {
        return subnameth;
    }

    public String getAddressth() {
        return addressth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddressth(String addressth) {
        this.addressth = addressth;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public void setDepnameth(String depnameth) {
        this.depnameth = depnameth;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public void setMynameth(String mynameth) {
        this.mynameth = mynameth;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public void setSubnameth(String subnameth) {
        this.subnameth = subnameth;
    }
}
