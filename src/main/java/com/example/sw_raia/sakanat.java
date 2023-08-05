package com.example.sw_raia;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class sakanat {

    static public List<HouseClass> house1 = new ArrayList<>();
    static public List<AdminClass> admin1 = new ArrayList<>();
    static public List<OwnerClass> owner1 = new ArrayList<>();
    static public List<TenantClass> tenant1 = new ArrayList<>();

    public  sakanat()
    {
        addhouse();
        addhouse();
        addowner();
        addtenant();
    }
public void addhouse()
{
    HouseClass h1=new HouseClass();
    h1.setPicture("C:/Users/Azhar Shhadeh/Downloads/house1.jpg");
    h1.setServices("electricy,water");
    h1.setLocation("rafidia");
    h1.setPrice(Integer.parseInt("650"));
    h1.setBalcony(Integer.parseInt("3"));
    h1.setBedroom(Integer.parseInt("3"));
    h1.setBedroom(Integer.parseInt("3"));
    h1.setNumberhouse(Integer.parseInt("1102230"));
    house1.add(h1);

    HouseClass h2=new HouseClass();
    h2.setPicture("C:\\Users\\Azhar%20Shhadeh\\Downloads\\house1");
    h2.setServices("electricy,water,WIFI");
    h2.setLocation("najah_street");
    h2.setPrice(Integer.parseInt("700"));
    h2.setBalcony(Integer.parseInt("1"));
    h2.setBedroom(Integer.parseInt("4"));
    h2.setBedroom(Integer.parseInt("4"));
    h2.setNumberhouse(Integer.parseInt("1101180"));
    house1.add(h2);

}





    public void addowner()
    {
        OwnerClass h1=new OwnerClass();
       h1.setid(408895811);
       h1.setAddress("Nabluse");
       h1.setPassword("12345**");
       h1.setPhonenumber(595861031);
       h1.setUsername("Abdullah Hussain");
        owner1.add(h1);

        OwnerClass h2=new OwnerClass();
        h2.setid(428678901);
        h2.setAddress("Jenen");
        h2.setPassword("987654");
        h2.setPhonenumber(597257511);
        h2.setUsername("Bader ibrahem");
        owner1.add(h2);
    }

    public void addadmin()
    {

        AdminClass h1=new AdminClass();
        h1.setPassword("123456**");
        h1.setUsername("Raia Ishtayeh");
        admin1.add(h1);

        AdminClass h2=new AdminClass();
        h1.setPassword("654321**");
        h1.setUsername("Rayhan Mahmoud");
        admin1.add(h1);
    }
    public void addtenant()
    {
        TenantClass h1=new TenantClass();
        h1.setAge(20);
        h1.setId(425968711);
        h1.setGender("female");
        h1.setPhonenumber(593646472);
        h1.setPassword("98765**");
        h1.setUniversityMajors("CE");
        h1.setUsername("Salma abdullah");
        tenant1.add(h1);

        TenantClass h2=new TenantClass();
        h2.setAge(30);
        h2.setId(745895644);
        h2.setGender("male");
        h2.setPhonenumber(595761287);
        h2.setPassword("145236**");
        h2.setUniversityMajors("medicin");
        h2.setUsername("Ghaith abdullah");
        tenant1.add(h2);
    }




}
