package com.example.amauri_tavares_final_group_project.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.example.amauri_tavares_final_group_project.api.AppUtil;
import com.example.amauri_tavares_final_group_project.datamodel.courseDataModel;


public class AppDataBase extends SQLiteOpenHelper {// <--- Implements Constructor e Metoddos  SQLite BD


    public static final String DB_NAME = "Course.sqlite";// <-----DB Name
    public static final int DB_VERSION = 1;//<------ Version

    SQLiteDatabase db;

    public AppDataBase(Context context) {

        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de Dados");

        db = getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(courseDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Course " + courseDataModel.criarTabela());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /*
     * Método para INCLUIR  dados no BD
     *
     * */
    public boolean insert(String tabela, ContentValues dados) {

        Log.d(AppUtil.TAG, "Aqui Filho da Puta: ");
        db = getWritableDatabase();// por segurança chamada novamente
        boolean retorno = false;

//      Regra de negócio
        try {
            //  O que deve ser realizado
            //  Salvar os dados


            retorno = db.insert(tabela, null, dados) > 0;// <------iserir dados na tabela

        } catch (Exception e) {
            Log.d(AppUtil.TAG, "insert: " + e.getMessage());

        }

        return retorno;

    }

    /*
     * Método para DELETAR  dados no BD
     *
     * */
    public boolean deleteByID(String tabela, int id) {

        db = getWritableDatabase();// por segurança chamada novamente

        boolean retorno = false;

//        Regra de negócio
        try {
            //  Deletar dados
            retorno = db.delete(tabela, "id = ?", new String[]{String.valueOf(id)}) > 0;// <------deletar  dados na tabela

        } catch (Exception e) {
            Log.d(AppUtil.TAG, "delete: " + e.getMessage());

        }

        return retorno;

    }

    /*
     * Método para DELETAR  dados no BD
     *
     * */
    public boolean update(String tabela, ContentValues dados) {

        db = getWritableDatabase();

        boolean retorno = false;


//      Regra de negócio
        try {
            //  Alterar   dados

            retorno = db.update(tabela, dados, "id = ?", new String[]{String.valueOf(dados.get("id"))}) > 0;// <------alterar dados na tabela -> ? = new String[] {String.valueOf(dados.get("id"))}

        } catch (Exception e) {
            Log.d(AppUtil.TAG, "alterado: " + e.getMessage());

        }

        return retorno;

    }

    /*
     * Método para ALTERAR dados no BD
     *
     * */
   /* public List<Program> getAllClientes(String tabela) {

        db = getWritableDatabase();

        //db = getReadableDatabase()// <---- Atenção pode ser apenas leitura recomendado

        List<Program> program = new ArrayList<>();// Declaração  Liss p/ Salvar o resultado do BD
        Program obj = new Program();

        String sql = "SELECT * FROM "+ tabela ; // <---- Declaração de consulta no BD

        Cursor cursor ;// Classe responsavel por retornar resultado do BD

        cursor = db.rawQuery(sql, null);// Tratar consulta

        if ( cursor.moveToFirst())// <--- se tive uma nova linha = true
            do{

                obj = new  Program();
                obj.setId(cursor.getInt(cursor.getColumnIndex(ProgramDataModel.ID)));
                obj.setNome(cursor.getString(cursor.getColumnIndex(ProgramDataModel.NOME)));
                obj.setEmail(cursor.getString(cursor.getColumnIndex(ProgramDataModel.EMAIL)));

                program.add(obj);

                Log.i("Listar", "getAllClientes: "+ obj.getNome());

            }while (cursor.moveToNext());// <--- move para a proxima linha

        return program;

    }*/


}
