package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private String name;
    private String address;
    private String phone;
    private String email;

    public MainViewModel(){
        this.name = "name";
        this.address = "address";
        this.phone = "phone";
        this.email = "email";
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String string) {
        this.name = string;
    }
    public void setAddress(String string) {
        this.address = string;
    }
    public void setPhone(String string) {
        this.phone = string;
    }
    public void setEmail(String string) {
        this.email = string;
    }

}
