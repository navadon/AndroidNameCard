package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private String name;
    private String id;
    private String email;
    private String phone;

    public MainViewModel() {
        this.name = "Kanokwan Pinthong";
        this.id = "580610619";
        this.email = "Email: Tenno_Warframe@gmail.com";
        this.phone = "Phone: 093-XXXXXXX";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
