package hcmute.spkt.nhom12.washdish_12;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    public Database (Context context){
        super(context,"Foody",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //CuaHang
        String sql = "CREATE TABLE CuaHang(Id INTEGER PRIMARY KEY AUTOINCREMENT,nameCuaHang TEXT, desCuaHang TEXT, imgCuaHang TEXT)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('HighLands Coffee','Highlands Coffee là chuỗi cửa hàng kinh doanh cà phê và các loại đồ ăn nhanh của Việt Nam, do David Thái sáng lập vào năm 1999','highlandscoffee')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('Tea Gon','Xem menu & đặt món trực tuyến từ Trà Sữa Tea Gon - Linh Đông rất dễ dàng. Giao hàng tận nơi trong vòng ít phút','teagon')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('KFC','Kentucky Fried Chicken, thường được biết đến với tên gọi tắt là KFC, là một chuỗi cửa hàng đồ ăn nhanh của Mỹ chuyên về các sản phẩm gà rán','kfc')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('Jollibee','Jollibee Foods Corporation là một chuỗi nhà hàng đồ ăn nhanh đa quốc gia của Philippines','jollibee')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('The Coffee House','The Coffee House là một thương hiệu chuỗi cửa hàng cà phê, đồ uống được giới trẻ Việt Nam đặc biệt yêu thích trong những năm gần đây','thecoffeehouse')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('Cơm tấm Sà Bì Chưởng','Xem menu & đặt món trực tuyến từ Cơm Tấm Sà Bì Chưởng - Trần Bình Trọng rất dễ dàng. Giao hàng tận nơi trong vòng ít phút','sabichuong')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('The Pizza Company','Sự lựa chọn lý tưởng dành cho thực khách đam mê món ngon đặc sắc, mang phong cách ẩm thực Ý nhưng rất phù hợp với khẩu vị của người Việt','pizzacompany')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('KOI THÉ','Koi Thé là thương hiệu trà sữa được du nhập vào Việt Nam và được giới trẻ vô cùng yêu thích bởi hương vị thơm ngon và đặc sắc riêng','koi')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('Mì cay Sasin','Mì cay Sasin tự hào là thương hiệu Mì Cay 7 Cấp Độ Hàn Quốc tiên phong và tạo nên cơn sốt hiện nay trong giới trẻ','micay')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('Phở Hà Nội','Phở là một món ăn truyền thống của Việt Nam, có nguồn gốc từ Hà Nội và Nam Định, và được xem là một trong những món ăn tiêu biểu cho nền ẩm thực Việt Nam','pho')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO CuaHang(nameCuaHang, desCuaHang, imgCuaHang) VALUES ('Lẩu Nghiện','Một nồi lẩu bao gồm một bếp đang đỏ lửa và nồi nước dùng đang sôi. Các món ăn sống được để xung quanh và người ăn gắp đồ ăn sống bỏ vào nồi nước dùng, đợi chín tới và ăn nóng','lau')";
        sqLiteDatabase.execSQL(sql);

        //User
        sql = "CREATE TABLE User(Id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT, password TEXT, fname TEXT, phone TEXT, address TEXT)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO User(email, password, fname, phone, address) VALUES ('vanh@gmail.com','123','Trần Việt Anh','0946754737','Buôn Ma Thuột')";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS CuaHang");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS MonAn");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS User");
    }

    public boolean themUser(UserItem userItem){
        boolean result = true;
        try {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("email",userItem.getEmail());
            contentValues.put("password",userItem.getPassword());
            contentValues.put("fname",userItem.getFname());
            contentValues.put("phone",userItem.getPhone());
            contentValues.put("address",userItem.getAdrs());
            result = sqLiteDatabase.insert("User",null,contentValues) > 0;
        } catch (Exception e){
            return false;
        }
        return result;
    }

    public boolean suaUser(UserItem userItem){
        boolean result = true;
        try {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("email",userItem.getEmail());
            contentValues.put("password",userItem.getPassword());
            contentValues.put("fname",userItem.getFname());
            contentValues.put("phone",userItem.getPhone());
            contentValues.put("address",userItem.getAdrs());
            result = sqLiteDatabase.update("User", contentValues,"Id=?",new String[] {String.valueOf(userItem.getId())})>0;
        } catch (Exception e){
            return false;
        }
        return result;
    }

    public UserItem checkLogin(String email, String password){
        UserItem user = null;
        try {
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cs = sqLiteDatabase.rawQuery("SELECT * FROM User WHERE email=? AND password=?", new String[]{email,password});
            if(cs.moveToFirst()){
                user = new UserItem();
                user.setId(cs.getInt(0));
                user.setEmail(cs.getString(1));
                user.setPassword(cs.getString(2));
                user.setFname(cs.getString(3));
                user.setPhone(cs.getString(4));
                user.setAdrs(cs.getString(5));
            }
        } catch (Exception e) {
            user = null;
        }
        return user;
    }

    public UserItem checkEmailExists(String email){
        UserItem user = null;
        try {
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cs = sqLiteDatabase.rawQuery("SELECT * FROM User WHERE email=?", new String[]{email});
            if(cs.moveToFirst()){
                user = new UserItem();
                user.setId(cs.getInt(0));
                user.setEmail(cs.getString(1));
                user.setPassword(cs.getString(2));
                user.setFname(cs.getString(3));
                user.setPhone(cs.getString(4));
                user.setAdrs(cs.getString(5));
            }
        } catch (Exception e) {
            user = null;
        }
        return user;
    }

    public UserItem find(int id){
        UserItem user = null;
        try {
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cs = sqLiteDatabase.rawQuery("SELECT * FROM User WHERE id=?", new String[]{String.valueOf(id)});
            if(cs.moveToFirst()){
                user = new UserItem();
                user.setId(cs.getInt(0));
                user.setEmail(cs.getString(1));
                user.setPassword(cs.getString(2));
                user.setFname(cs.getString(3));
                user.setPhone(cs.getString(4));
                user.setAdrs(cs.getString(5));
            }
        } catch (Exception e) {
            user = null;
        }
        return user;
    }
}
