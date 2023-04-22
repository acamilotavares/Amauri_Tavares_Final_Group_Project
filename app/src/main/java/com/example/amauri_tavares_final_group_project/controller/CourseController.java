package com.example.amauri_tavares_final_group_project.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.example.amauri_tavares_final_group_project.api.AppUtil;
import com.example.amauri_tavares_final_group_project.datamodel.courseDataModel;
import com.example.amauri_tavares_final_group_project.datasource.AppDataBase;
import com.example.amauri_tavares_final_group_project.model.Course;

import java.util.ArrayList;
import java.util.List;




public class CourseController extends AppDataBase implements ICrud<Course> {

    ContentValues dadoDoObjeto;

    public CourseController(Context context) {

        super(context);
        Log.d(AppUtil.TAG, "Course Controller: Conectado ");

    }

    @Override
    public boolean incluir(Course obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put("code_course", obj.getCourse_code());
        dadoDoObjeto.put("name_course", obj.getCourse_name());
        dadoDoObjeto.put("description_course", obj.getDescription());
        dadoDoObjeto.put("fees", obj.getFees());

        Log.d(AppUtil.TAG, "Course Controller: Conectado ");
       // Log.d(AppUtil.TAG, String.valueOf(insert(courseDataModel.TABELA, dadoDoObjeto)));
        return insert(courseDataModel.TABELA, dadoDoObjeto);//insert table name = product
    }

    @Override
    public boolean alterar(Course obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put("id_course", obj.getId_Course());

        return false;
    }

    @Override
    public boolean deletar(int id) {
        return false;
    }

    @Override
    public List<Course> listar() {

        List<Course> list = new ArrayList<>();

        return list;
    }
}
