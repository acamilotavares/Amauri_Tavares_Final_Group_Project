package com.example.amauri_tavares_final_group_project.model;

public class House {
    private  int id_House;
    private String code_house;
    private String city_house;
    private String address_house;
    private float price;

    public House(String code_house, String city_house, String address_house, float price) {
        this.code_house = code_house;
        this.city_house = city_house;
        this.address_house = address_house;
        this.price = price;
    }

//    public House() {
//
//    }
    public int getId_House() {
        return id_House;
    }

    public void setId_House(int id_House) {
        this.id_House = id_House;
    }

    public String getCode_house() {
        return code_house;
    }

    public void setCode_house(String code_house) {
        this.code_house = code_house;
    }

    public String getCity_house() {
        return city_house;
    }

    public void setCity_house(String city_house) {
        this.city_house = city_house;
    }

    public String getAddress_house() {
        return address_house;
    }

    public void setAddress_house(String address_house) {
        this.address_house = address_house;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }




}
