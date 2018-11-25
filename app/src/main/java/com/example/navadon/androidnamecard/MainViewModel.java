package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private String string, string1, string2, string3;

    public MainViewModel(){
        this.string = "constructor";
        this.string1 = "constructor";
        this.string2 = "constructor";
        this.string3 = "constructor";
    }

    public String getString() {
        return string;
    }

    public String getString1() {
        return string1;
    }
    public String getString2() {
        return string2;
    }
    public String getString3() {
        return string3;
    }

    public void setString(String string) {
        this.string = string;
    }
    public void setString1(String string) {
        this.string1 = string;
    }
    public void setString2(String string) {
        this.string2 = string;
    }
    public void setString3(String string) {
        this.string3 = string;
    }
}
//import android.arch.lifecycle.ViewModel;
//
//
//public class MainViewModel extends ViewModel {
//    private String str1;
//    private String str2;
//    private String str3;
//    private String str4;
//
//    public MainViewModel(){
//        this.str1 = "";
//        this.str2 = "";
//        this.str3 = "";
//        this.str4 = "";
//    }
//
//    public String getString(String key) {
//        switch (key) {
//            case "FB" : return str1;
//            case "IG" : return str2;
//            case "email" : return str3;
//            case "name" : return str4;
//            default: return "";
//        }
//    }
//
//    public void setString(String key, String value) {
//        switch (key) {
//            case "FB" : str1 = value; break;
//            case "IG" : str2 = value; break;
//            case "email" : str3 = value; break;
//            case "name" : str4 = value; break;
//            default: break;
//        }
//    }
//}
