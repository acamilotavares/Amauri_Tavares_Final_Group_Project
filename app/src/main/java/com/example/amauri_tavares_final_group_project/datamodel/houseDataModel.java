package com.example.amauri_tavares_final_group_project.datamodel;

public class houseDataModel {


//    Model Objet relacional

//    3- Query created  tabelno BD
//    4- Query  Gerak Consult

    //    1_ Table name attribute
    public static final String TABELA = "House";

    //    2- Table name attribute fields
    public static final String ID_house = "id_house";//integer
    public static final String CODE_house = "code_house";// text
    public static final String house_CITY = "city_house";// text
    public static final String house_ADDRESS = "address_house";// text
    public static final String PRICE = "price";// text

    //    3- Query created Table
    public static String queryCriarTabela = "";

    //    4- Script
    public static String criarTabela() {

//  Concatenação String
        queryCriarTabela += " CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID_house + " integer primary key autoincrement, ";
        queryCriarTabela += CODE_house + " text, ";
        queryCriarTabela += house_CITY + " text,  " ;
        queryCriarTabela += house_ADDRESS + " text,  " ;
        queryCriarTabela += PRICE + " text  " ;
        queryCriarTabela +=  ")";

        return queryCriarTabela;
    }
}

