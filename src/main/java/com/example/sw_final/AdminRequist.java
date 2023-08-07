package com.example.sw_final;

public class AdminRequist {


    public AdminRequist(AdminRequist data) {
        this.Username=data.Username;
        this.houseNum  = data.houseNum;

    }    public AdminRequist() {

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    private String Username;

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    private int houseNum;


}
