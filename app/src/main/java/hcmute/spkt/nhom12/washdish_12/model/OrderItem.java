package hcmute.spkt.nhom12.washdish_12.model;

public class OrderItem {
    private int Id;
    private String nameCuaHang;
    private String nameMonAn;
    private int price;
    private  int IdUser;

    public OrderItem() {
    }

    public OrderItem(int id, String nameCuaHang, String nameMonAn, int price, int idUser) {
        Id = id;
        this.nameCuaHang = nameCuaHang;
        this.nameMonAn = nameMonAn;
        this.price = price;
        IdUser = idUser;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameCuaHang() {
        return nameCuaHang;
    }

    public void setNameCuaHang(String nameCuaHang) {
        this.nameCuaHang = nameCuaHang;
    }

    public String getNameMonAn() {
        return nameMonAn;
    }

    public void setNameMonAn(String nameMonAn) {
        this.nameMonAn = nameMonAn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }
}
