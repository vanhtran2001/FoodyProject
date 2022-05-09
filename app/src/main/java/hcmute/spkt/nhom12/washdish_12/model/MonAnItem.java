package hcmute.spkt.nhom12.washdish_12.model;

public class MonAnItem {
    private int idMonAn;
    private String nameMonAn;
    private String desMonAn;
    private int priceMonAn;
    private String imageMonAn;
    private int idCuaHang;

    public MonAnItem(int idMonAn, String nameMonAn, String desMonAn, int priceMonAn, String imageMonAn, int idCuaHang) {
        this.idMonAn = idMonAn;
        this.nameMonAn = nameMonAn;
        this.desMonAn = desMonAn;
        this.priceMonAn = priceMonAn;
        this.imageMonAn = imageMonAn;
        this.idCuaHang = idCuaHang;
    }

    public MonAnItem() {

    }

    public int getIdMonAn() {
        return idMonAn;
    }

    public void setIdMonAn(int idMonAn) {
        this.idMonAn = idMonAn;
    }

    public String getNameMonAn() {
        return nameMonAn;
    }

    public void setNameMonAn(String nameMonAn) {
        this.nameMonAn = nameMonAn;
    }

    public String getDesMonAn() {
        return desMonAn;
    }

    public void setDesMonAn(String desMonAn) {
        this.desMonAn = desMonAn;
    }

    public int getPriceMonAn() {
        return priceMonAn;
    }

    public void setPriceMonAn(int priceMonAn) {
        this.priceMonAn = priceMonAn;
    }

    public String getImageMonAn() {
        return imageMonAn;
    }

    public void setImageMonAn(String imageMonAn) {
        this.imageMonAn = imageMonAn;
    }

    public int getIdCuaHang() {
        return idCuaHang;
    }

    public void setIdCuaHang(int idCuaHang) {
        this.idCuaHang = idCuaHang;
    }
}
