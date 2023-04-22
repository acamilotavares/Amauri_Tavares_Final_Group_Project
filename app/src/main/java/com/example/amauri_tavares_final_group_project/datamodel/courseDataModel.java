package com.example.amauri_tavares_final_group_project.datamodel;

public class courseDataModel {

//    Model Objet relacional

//    3- Query created  tabelno BD
//    4- Query  Gerak Consult

    //    1_ Table name attribute
    public static final String TABELA = "Course";

    //    2- Table name attribute fields
    public static final String ID_course = "id_course";//integer
    public static final String CODE_course = "code_course";// text
    public static final String course_NAME = "name_course";// text
    public static final String DESCRIPTION = "description_course";// text
    public static final String FEES = "fees";// text

    //    3- Query created Table
    public static String queryCriarTabela = "";

    //    4- Script
    public static String criarTabela() {

//  Concatenação String
        queryCriarTabela += " CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID_course + " integer primary key autoincrement, ";
        queryCriarTabela += CODE_course + " text, ";
        queryCriarTabela += course_NAME + " text,  " ;
        queryCriarTabela += DESCRIPTION + " text,  " ;
        queryCriarTabela += FEES + " text  " ;
        queryCriarTabela +=  ")";

        return queryCriarTabela;
    }
}
