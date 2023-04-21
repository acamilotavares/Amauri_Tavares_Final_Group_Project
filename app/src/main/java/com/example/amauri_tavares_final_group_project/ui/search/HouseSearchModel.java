package com.example.amauri_tavares_final_group_project.ui.search;

public class HouseSearchModel {


    private  String city= "";
    private String rooms = "";
    private String address;
    private int imgHouse;
    private String price;

    public HouseSearchModel(String city, String rooms, String address, int imgHouse, String price) {
        this.city = city;
        this.rooms = rooms;
        this.address = address;
        this.imgHouse = imgHouse;
        this.price = price;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImgHouse() {
        return imgHouse;
    }

    public void setImgHouse(int imgHouse) {
        this.imgHouse = imgHouse;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
