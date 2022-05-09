package hcmute.spkt.nhom12.washdish_12.dao;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import hcmute.spkt.nhom12.washdish_12.database.Database;
import hcmute.spkt.nhom12.washdish_12.model.OrderItem;

public class OrderDAO {
    Database database;
    public OrderDAO(Context context){
        database = new Database(context);
    }

    public ArrayList<OrderItem> getAllOrderById(int id){
        ArrayList<OrderItem> listOrder = new ArrayList<>();

        SQLiteDatabase db = database.getReadableDatabase();
        Cursor cs = db.rawQuery("SELECT * FROM Orders WHERE IdUser=?",new String[]{String.valueOf(id)});
        cs.moveToFirst();
        while (!cs.isAfterLast()){
            int idOrder = cs.getInt(0);
            String nameCuaHang = cs.getString(1);
            String nameMonAn = cs.getString(2);
            int price = cs.getInt(3);
            int idUser = cs.getInt(4);
            OrderItem orderItem = new OrderItem(idOrder,nameCuaHang,nameMonAn,price,idUser);
            listOrder.add(orderItem);
            cs.moveToNext();
        }
        cs.close();
        return listOrder;
    }
}
