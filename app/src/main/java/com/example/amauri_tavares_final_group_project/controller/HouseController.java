package com.example.amauri_tavares_final_group_project.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.example.amauri_tavares_final_group_project.api.AppUtil;
import com.example.amauri_tavares_final_group_project.datamodel.houseDataModel;
import com.example.amauri_tavares_final_group_project.datasource.AppDataBase;
import com.example.amauri_tavares_final_group_project.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseController extends AppDataBase implements ICrud<House> {

    ContentValues dadoDoObjeto;

    public HouseController(Context context) {

        super(context);
        Log.d(AppUtil.TAG, "Course Controller: Conectado ");
    }

    @Override
    public boolean incluir(House obj) {
        dadoDoObjeto = new ContentValues();

       // dadoDoObjeto.put("id_House", obj.getId_House());
        dadoDoObjeto.put("code_house", obj.getCode_house());
        dadoDoObjeto.put("city_house", obj.getCity_house());
        dadoDoObjeto.put("address_house", obj.getAddress_house());
        dadoDoObjeto.put("price", obj.getPrice());

        return insert(houseDataModel.TABELA, dadoDoObjeto);//insert table name = product
    }

    @Override
    public boolean alterar(House obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put("id_course", obj.getId_House());

        return false;
    }
    @Override
    public boolean deletar(int id) {
        return false;
    }

    @Override
    public List<House> listar() {

        List<House> list = new ArrayList<>();

        return list;
    }
}
