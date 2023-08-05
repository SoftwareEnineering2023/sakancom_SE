package com.example.sw_raia;

import java.util.ArrayList;
import java.util.List;

public class AdminClass {
    private String username;
    private  String password;

    public AdminClass()
    {
        addh();
    }

    public  void addh() {
        HouseClass h=new HouseClass();
        h.setPicture("C:/Users/hp/Desktop/summer2023/SW/houses_picture/house1.jpg");
        h.setServices("Water,electricy");
        h.setLocation("rafidia");
        h.setPrice(650);
        h.setBalcony(2);
        h.setBedroom(3);
        h.setBedroom(3);
        h.setNumberhouse(1102230);
      sakanat.house1.add(h);

    }
    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }








}
