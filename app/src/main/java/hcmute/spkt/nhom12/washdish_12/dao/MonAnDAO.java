package hcmute.spkt.nhom12.washdish_12.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.SplittableRandom;

import hcmute.spkt.nhom12.washdish_12.database.Database;
import hcmute.spkt.nhom12.washdish_12.model.MonAnItem;

public class MonAnDAO {
    Database database;
    public MonAnDAO(Context context){
        database = new Database(context);
    }

    public ArrayList<MonAnItem> getAllMonAnByIdCuaHang(int id){
        ArrayList<MonAnItem> listMonAn = new ArrayList<>();
        SQLiteDatabase db = database.getReadableDatabase();
        Cursor cs = db.rawQuery("SELECT * FROM MonAn WHERE IdCuaHang=?", new String[]{String.valueOf(id)});
        cs.moveToFirst();
        while (!cs.isAfterLast()){
            int idMonAn = cs.getInt(0);
            String nameMonAn = cs.getString(1);
            String desMonAn = cs.getString(2);
            int priceMonAn = cs.getInt(3);
            String imgMonAn = cs.getString(4);
            int idCuaHang = cs.getInt(5);
            MonAnItem monAnItem = new MonAnItem(idMonAn,nameMonAn,desMonAn,priceMonAn,imgMonAn, idCuaHang);
            listMonAn.add(monAnItem);
            cs.moveToNext();
        }
        cs.close();
        return listMonAn;
    }

    public MonAnItem find(int id){
        MonAnItem monAnItem = null;
        try {
            SQLiteDatabase db = database.getReadableDatabase();
            Cursor cs = db.rawQuery("SELECT * FROM MonAn WHERE Id=?", new String[]{String.valueOf(id)});
            if(cs.moveToFirst()){
                monAnItem = new MonAnItem();
                monAnItem.setIdMonAn(cs.getInt(0));
                monAnItem.setNameMonAn(cs.getString(1));
                monAnItem.setDesMonAn(cs.getString(2));
                monAnItem.setPriceMonAn(cs.getInt(3));
                monAnItem.setImageMonAn(cs.getString(4));
            }

        } catch (Exception e){
            monAnItem = null;
        }
        return monAnItem;
    }
}
