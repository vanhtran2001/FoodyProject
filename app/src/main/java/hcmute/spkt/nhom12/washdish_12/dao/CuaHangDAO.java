package hcmute.spkt.nhom12.washdish_12.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import hcmute.spkt.nhom12.washdish_12.model.CuaHangItem;
import hcmute.spkt.nhom12.washdish_12.database.Database;

public class CuaHangDAO {
    Database database;
    public CuaHangDAO (Context context){
        database = new Database(context);
    }
    public ArrayList<CuaHangItem> getAll(){
        ArrayList<CuaHangItem> listCuaHang = new ArrayList<>();
        SQLiteDatabase db = database.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM CuaHang", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String des = cursor.getString(2);
            String img = cursor.getString(3);
            CuaHangItem cuaHangItem = new CuaHangItem(id, name, des, img);
            listCuaHang.add(cuaHangItem);
            cursor.moveToNext();
        }
        cursor.close();
        return listCuaHang;
    }
    public CuaHangItem find(int id){
        CuaHangItem cuaHangItem = null;
        try {
            SQLiteDatabase db = database.getReadableDatabase();
            Cursor cs = db.rawQuery("SELECT * FROM CuaHang WHERE Id=?", new String[]{String.valueOf(id)});
            if(cs.moveToFirst()){
                cuaHangItem = new CuaHangItem();
                cuaHangItem.setId(0);
                cuaHangItem.setNameCuaHang(cs.getString(1));
                cuaHangItem.setDesCuaHang(cs.getString(2));
                cuaHangItem.setImageCuaHang(cs.getString(3));
            }
        } catch (Exception e) {
            cuaHangItem = null;
        }
        return cuaHangItem;
    }
}
