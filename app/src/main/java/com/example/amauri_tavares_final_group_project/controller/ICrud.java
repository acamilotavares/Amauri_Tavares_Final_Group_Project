package com.example.amauri_tavares_final_group_project.controller;

import java.util.List;

public interface ICrud<T> {// <-----Forma de declarar assinatura interface


    // Metodos para persistência no BD

    //    Incluir
    public boolean incluir(T obj);// <-----Forma de declarar assinatura interface - incluir(T obj)

    //    Alterar
    public boolean alterar(T obj);// <-----Forma de declarar assinatura interface

    //    Deletar
    public boolean deletar(int id);// <-----Forma de declarar assinatura interface  ATENÇÃO aqui precisa apenas ID

    //    Listar
    public List<T> listar();// <----- ***** Atenção aqui**** apenas listar retorno List


//    CRUD - Create Retrieve Update Delete


}
