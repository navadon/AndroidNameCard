package com.example.navadon.androidnamecard;
import android.arch.lifecycle.ViewModel;
public class MainViewModel extends ViewModel {
    private String contrack_1;
    private String contrack_2;
    private String contrack_3;
    private String contrack_4;
    private String contrack_5;
    public MainViewModel(){
        this.contrack_1 =  "239 Huay Kaew Road, Suthep, Chiang Mai";
        this.contrack_2 = "AndroiDeveloper@gmail.com";
        this.contrack_3 = "02\"-\"1234\"-\"555";
        this.contrack_4 = "www.Androiddev.get.aa.a";
        this.contrack_5 = "Press enter to about us";
    }

    public String getContrack_1() {
        return contrack_1;
    }

    public String getContrack_2() {
        return contrack_2;
    }

    public String getContrack_3() {
        return contrack_3;
    }

    public String getContrack_4() {
        return contrack_4;
    }

    public String getContrack_5() {
        return contrack_5;
    }

    public void setContrack_1(String string) {
        this.contrack_1 = string;
    }

    public void setContrack_2(String contrack_2) {
        this.contrack_2 = contrack_2;
    }

    public void setContrack_3(String contrack_3) {
        this.contrack_3 = contrack_3;
    }

    public void setContrack_4(String contrack_4) {
        this.contrack_4 = contrack_4;
    }

    public void setContrack_5(String contrack_5) {
        this.contrack_5 = contrack_5;
    }
}
