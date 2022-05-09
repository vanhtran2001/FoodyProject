package hcmute.spkt.nhom12.washdish_12.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import hcmute.spkt.nhom12.washdish_12.model.OrderItem;
import hcmute.spkt.nhom12.washdish_12.model.UserItem;

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

        //Food
        //1
        sql = "CREATE TABLE MonAn(Id INTEGER PRIMARY KEY AUTOINCREMENT, nameMonAn TEXT, desMonAn TEXT, priceMonAn INTEGER, imgMonAn TEXT, IdCuaHang INTEGER, FOREIGN KEY (IdCuaHang) REFERENCES CuaHang(Id))";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('PHIN Sữa Đá', 'PHIN Coffee & Condensed Milk', 29000, 'caphesuadahighlands', 1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('PHIN Đen Đá', 'PHIN Coffee', 29000, 'caphedendahighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Bạc Xỉu Đá', 'White PHIN Coffee & Condensed Milk', 35000,'bacxiuhighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà Sen Vàng', 'Oolong Tea, Lotus Seeds & Milk Foam', 39000,'trasenvanghighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà Thạch Đào', 'Peach Tea, Peach Jelly & Milk', 39000,'trathachdaohighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà Thanh Đào', 'Peach Tea & Lemongrass', 39000,'trathanhdaohighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà Thạch Vải', 'Red Tea & Lychee Jelly', 39000,'trathachvaihighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà Xanh Đậu Đỏ', 'Green Tea & Red Beans', 39000,'traxanhdaudohhighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Freeze Trà Xanh', 'Green Tea Freeze', 49000,'freezetraxanhhighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Freeze Socola', 'Chocolate Freeze', 49000,'freezesocolahighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Chanh Đá Viên', 'Lime Ice Iced', 39000,'chanhdavienhhighlands',1)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Tắc Quất Đá Viên', 'Iced Kumquat', 39000,'tacdavienhighlands',1)";
        sqLiteDatabase.execSQL(sql);

        //2
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa kỷ tử','',29000,'trasuakytuteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa Socola','',23000,'trasuasocolateagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa matcha','',23000,'trasuamatchateagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa phổ nhĩ','',29000,'trasuaphonhiteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa Olong','',22000,'trasuaolongteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa sen','',22000,'trasuasenteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa thiết quan âm','',25000,'trasuathietquanamteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa Olong tứ quý','',29000,'trasuaolongtuquyteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa tử sa','',22000,'trasuatusateagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Hồng trà sữa','',22000,'hongtrasuateagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Lục trà sữa','',22000,'luctrasuateagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Thanh trà đào','',35000,'thanhtradaoteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà đào cam sả','',35000,'tradaocamsateagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Thiết quan âm đào','',32000,'thiequanamdaoteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Hồng trà vãi','',32000,'hongtravaiteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Lục trà vãi','',32000,'luctravaiteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà cam mật ong','',35000,'tracamongmatteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà dâu tây','',37000,'tradautayteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà đào hồng','',37000,'tradaohongteagon',2)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà kiwi','',37000,'trakiwigteagon',2)";
        sqLiteDatabase.execSQL(sql);

        //3
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Gà Rán 1 Miếng', '1 Miếng Gà Giòn Cay / 1 Miếng Gà Giòn Không Cay / 1 Miếng Gà Truyền Thống', 36000,'garankfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Gà Quay 1 Miếng', '1 Miếng Đùi Gà Quay Giấy Bạc / 1 Miếng Đùi Gà Quay Tiêu', 68000,'gaquaykfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Gà Phi lê 1 Miếng', '1 Miếng Phi-lê Gà Quay Flava / 1 Miếng Phi-lê Gà Quay Tiêu', 36000,'gaphilekfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Gà Rán', 'Cơm Gà Giòn Cay (1 Phần) / Cơm Gà Giòn Không Cay (1 Phần) / Cơm Gà Truyền Thống (1 Phần)', 43000,'comgarankfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Gà Bít-tết', 'Cơm Gà Bít-tết (1 Phần)', 43000,'comgabittetkfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Gà Phi-lê', 'Cơm Phi Lê Gà Quay Flava (1 Phần) / Cơm Phi Lê Gà Quay Tiêu (1 Phần)', 43000,'comgaphilekfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Gà Xiên Que', 'Cơm Gà Xiên Que (1 Phần)', 43000,'comgaxienquekfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Burger Tôm', 'Burger Tôm (1 Phần)', 42000,'burgertomkfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Burger Gà Quay', 'Burger Gà Quay Flava (1 Phần)', 48000,'burgergaquaykfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Burger Zinger', 'Burger Zinger (1 Phần)', 51000,'burgerzingerkfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Mì Ý Xốt Cà Gà Viên', 'Mì Ý Xốt Cà Gà Viên (1 Phần)', 38000,'miysotgavienkfc',3)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Mì Ý Xốt Cà Gà Zinger', 'Mì Ý Xốt Cà Gà Zinger (1 Phần)', 54000,'miysotgazingerkfc',3)";
        sqLiteDatabase.execSQL(sql);

        //4
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Combo 1','1 miếng gà sốt cay + khoai tây chiên lớn + nước ngọt lớn',37000,'combo1jollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Combo 2','1 miếng gà sốt cay + khoai tây lắc vị thịt nướng BBQ vừa + trà đào vừa',65000,'combo2jollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Combo 3','1 miếng gà sốt cay + khoai tây chiên vừa + trà đào vừa',65000,'combo3jollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Gà cay','1 miếng gà sốt cay',35000,'gacayjollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Combo 4','1 miếng gà sốt cay + khoai tây chiên vừa + bánh xoài đào + nước ngọt lớn',75000,'combo4jollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Khoai tây chiên','Khoai tây chiên - lớn',25000,'khoaitaychienjollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Khoai viên','Khoai viên rong biển',25000,'khoaivienjollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Khoai tây lắc','Khoai tây lắc vị thịt nướng BBQ - lớn',35000,'khoaitaylacjollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Nước suối','Nước suối Aquafina - 500ml',8000,'nuocsuoijollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Nước ngọt','Nước ngọt - lớn',15000,'nuocngotjollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà đào','Trà đào - ly lớn',20000,'tradaojollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cacao','Cacao sữa đá - lớn',23000,'cacaojollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Hot wings','Hot Wings - Cánh gà sốt tiêu',35000,'hotwingsjollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Combo Burger 1','Sandwich thịt nướng BBQ + khoai tây lắc vị thịt nướng BBQ vừa + nước ngọt lớn',65000,'comboburger1jollibee',4)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Combo Burger 2','Sandwich gà giòn + khoai tây lắc vị thịt nướng BBQ vừa + nước ngọt lớn',55000,'comboburger2jollibee',4)";
        sqLiteDatabase.execSQL(sql);

        //5
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cà Phê Sữa Đá', '', 29000,'caphesuadacoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cà Phê Sữa Nóng', '', 35000,'caphesuanongcoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Bạc Xỉu Đá', '', 29000,'bacxiudacoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Bạc Xỉu Nóng', '', 35000,'bacxiunongcoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cà Phê Đen Đá', '', 29000,'caphedendacoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cà Phê Đen Nóng', '', 35000,'caphedennongcoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Latte Đá', '', 49000,'lattedacoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Latte Nóng', '', 49000,'lattenongcoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Americano Đá', '', 40000,'americanodacoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Americano Nóng', '', 40000,'americanonongcoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cappuccino Đá', '', 49000,'capudacoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cappuccino Nóng', '', 49000,'capunongcoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Espresso Đá', '', 45000,'espressodacoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Espresso Nóng', '', 40000,'espressonongcoffeehouse',5)";
        sqLiteDatabase.execSQL(sql);

        //6
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Sườn Chả La','',59000,'comsuonchalasabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Sà Bì Chưởng','',63000,'comsabichuongsabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Sườn Bì','',54000,'comsuonbisabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Sườn La','',54000,'comsuonlasabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Sườn Chả','',54000,'comsuonchasabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Sườn Cốt Lết','',45000,'comsuoncotletsabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Ba Rọi Chiên Mắm Tỏi','',50000,'caombaroichienmamtoisabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Sườn Cọng Nướng','',59000,'comsuoncongnuongsabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Đùi Gà Chiên Mắm','',50000,'comduigachienmamsabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Lạp Xưởng Nướng','',40000,'comlapxuongnuongsabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cơm Bì Chả','',35000,'combichasabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('ĐẶC BIỆT Sườn Bì Chả La','',72000,'dacbietsabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Coca Light','',15000,'cocasabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Sprite','',15000,'spritesabichuong',6)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Nước Suối','',10000,'nuocsuoisabichuong',6)";
        sqLiteDatabase.execSQL(sql);

        //7
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Gà Nướng Dứa', 'Thịt gà mang vị ngọt của dứa kết hợp với vị cay nóng của ớt',119000,'pizzaganuongduapizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Phô Mai', 'Bánh Pizza với vô vàn phô mai để bạn tha hồ tận hưởng',119000,'pizzaphomaipizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Xúc Xích Ý', 'Xúc xích cay kiểu Ý trên nền sốt cà chua',119000,'pizzaxucxichypizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Thịt Nguội & Nấm', 'Pizza giăm bông và nấm đem đến cho bạn những trải nghiệm thú vị',119000,'pizzathitnguoipizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Hawaiian', 'Giăm bông, thịt muối và dứa',119000,'pizzahawaiianpizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Rau Củ', 'Hành, ớt chuông, nấm, dứa, cà chua',119000,'pizzaraucupizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Aloha', 'Thịt nguội, xúc xích tiêu cay và dứa hòa quyện với sốt Thousand Island',129000,'pizzaaholapizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Thịt Xông Khói', 'Thịt giăm bông, thịt xông khói và hai loại rau của ớt xanh, cà chua',129000,'pizzathitxongkhoipizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Thịt Nguội Kiểu Canada', 'Sự kết hợp giữa thịt nguội và bắp ngọt',129000,'pizzacanadapizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza Gà Nướng 3 Vị', 'Gà nướng, gà bơ tỏi và gà ướp sốt nấm',129000,'pizzaganuong3vipizzacompany',7)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Pizza 5 Loại Thịt Đặc Biệt', 'Xúc xích lợn và bò đặc trưng của Ý, giăm bông, thịt xông khói',129000,'pizzathitdacbietpizzacompany',7)";
        sqLiteDatabase.execSQL(sql);

        //8
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa oolong - size S','Oolong sweetened milk tea',45000,'trasuaoolongkoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa oolong latte - size S','Oolong tea latte',50000,'trasuaoolonglattekoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa oolong hoàng kim - size S','Golden oolong tea.',35000,'trasuaoolonghoangkiemkoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa oolong đào - size S','Peach oolong tea',45000,'trasuaoolongdaokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Trà sữa oolong macchiato - size S','Oolong tea macchiato. Dòng thức uống đặc trưng, không thêm topping, không dùng ống hút',45000,'trasuaoolongmacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Đào oolong macchiato - size S','Peach oolong tea macchiato. Dòng thức uống đặc trưng, không thêm topping, không dùng ống hút',45000,'daooolongmacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Milo Ô macchiato - Size S','Milo O macchiato. Dòng thức uống đặc trưng, không thêm topping, không dùng ống hút',45000,'miloomacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Đào macchiato - size S','Peach macchiato - size S. Món dùng không thể thêm topping & không dùng ống hút',45000,'daomacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Hồng trà macchiato - size S','Black tea macchiato - size S. Món dùng không thể thêm topping & không dùng ống hút',45000,'hongtramacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Lục trà macchiato - size S','Green tea macchiato - size S. Món dùng không thể thêm topping & không dùng ống hút',45000,'luctramacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Hồng trà hương caramel macchiato - size S','Caramel black tea macchiato - size S. Món dùng không thể thêm topping & không dùng ống hút',55000,'hongtracaramelmacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Hồng trà hương hazelnut macchiato - size S','Hazelnut black tea macchiato - size S. Món dùng không thể thêm topping & không dùng ống hút',55000,'hongtrahazelnutmacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cacao macchiato - size S','Ovaltine macchiato - size S. Món dùng không thể thêm topping & không dùng ống hút',60000,'cacaomacchiatokoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cold brew coffee - size S','',35000,'coldbrewcoffeekoithe',8)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Cold brew latte - size S','',49000,'coldbrewlattekoithe',8)";
        sqLiteDatabase.execSQL(sql);

        //9
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ KIM CHI BÒ ÚC', 'Mì Chinnoo, bò, cá viên, xúc xích, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 55000,'mikimchiboucsasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ KIM CHI GÀ', 'Mì Chinnoo, gà, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 49000,'mikimchigasasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ KIM CHI BÒ MỸ', 'Mì Chinnoo, bò Mỹ, xúc xích, cá viên, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 55000,'mikimchibomysasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ KIM CHI CÁ', 'Mì Chinnoo, tôm, mực, cá viên, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 49000,'mikimchicasasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ KIM CHI HẢI SẢN', 'Mì Chinnoo, tôm, mực, cá viên, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 55000,'mikimchihaisansasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ LẨU THÁI', 'Mì Chinnoo, tôm, mực, cá viên, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 55000,'milauthaisasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ GOGI', 'Mì Chinnoo, thịt heo, xúc xích, cá viên, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 49000,'migogisasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ TOMYUM HẢI SẢN', 'Mì Chinnoo, tôm, mực, cá viên, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 55000,'mitomyumhaisansasin',9)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('MÌ TOMYUM BÒ ÚC', 'Mì Chinnoo, bò, xúc xích, cá viên, nấm kim châm, kim chi, bắp cải tím, bông cải xanh', 55000,'mitomyumboucsasin',9)";
        sqLiteDatabase.execSQL(sql);

        //10
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Miến Gà tô lớn','',55000,'miengahanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở gà tô lớn','',50000,'phogahanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở bò tô lớn','',50000,'phobohanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở tái nạm','',50000,'photainamhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở tái gầu','',50000,'photaigauhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở tái gân','',50000,'photaigahanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở tái bò viên','',50000,'photaibovienhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở nạm gân','',50000,'phonamganhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở nạm gầu','',50000,'phonamgauhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở nạm viên','',50000,'phonamvienhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở gầu viên','',50000,'phogauvienhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở gầu gân','',50000,'phogauganhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở tái','',45000,'photaihanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở gân','',45000,'phoganhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở Bò Viên','',45000,'phobovienhanoi',10)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('Phở nạm','',45000,'phonamhanoi',10)";
        sqLiteDatabase.execSQL(sql);

        //11
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('LẨU THÁI HẢI SẢN', '', 285000,'lauthaihaisanlaunghien',11)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('LẨU CÁ MĂNG CAY', '', 485000,'laucamangcaylaunghien',11)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('LẨU CÁ SONG', '', 285000,'lauthaihaisanlaunghien',11)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('LẨU THÁI HẢI SẢN', '', 1550000,'laucasonglaunghien',11)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('LẨU CHIM CÂU', '', 285000,'lauchimcaulaunghien',11)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO MonAn(nameMonAn, desMonAn, priceMonAn, imgMonAn, IdCuaHang) VALUES ('LẨU GÀ TA', '', 695000,'laugatalaunghien',11)";
        sqLiteDatabase.execSQL(sql);

        //User
        sql = "CREATE TABLE User(Id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT, password TEXT, fname TEXT, phone TEXT, address TEXT)";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO User(email, password, fname, phone, address) VALUES ('vanh@gmail.com','123','Trần Việt Anh','0946754737','Buôn Ma Thuột')";
        sqLiteDatabase.execSQL(sql);

        //Order
        sql = "CREATE TABLE Orders(Id INTEGER PRIMARY KEY AUTOINCREMENT, nameCuaHang TEXT, nameMonAn TEXT, totalPrice INT, IdUser INT, FOREIGN KEY (IdUser) REFERENCES User(Id))";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS CuaHang");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS MonAn");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS User");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Orders");
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

    public boolean themOrder(OrderItem orderItem){
        boolean result = true;
        try {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("nameCuaHang",orderItem.getNameCuaHang());
            contentValues.put("nameMonAn", orderItem.getNameMonAn());
            contentValues.put("totalPrice", orderItem.getPrice());
            contentValues.put("IdUser", orderItem.getIdUser());
            result = sqLiteDatabase.insert("Orders",null,contentValues) > 0;
        } catch (Exception e){
            return false;
        }
        return result;
    }

}
