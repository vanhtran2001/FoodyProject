package hcmute.spkt.nhom12.washdish_12;

public class CuaHangItem {
    private int id;
    private String nameCuaHang;
    private String desCuaHang;
    private String imageCuaHang;

    public CuaHangItem(int id, String nameCuaHang, String desCuaHang, String imageCuaHang) {
        this.id = id;
        this.nameCuaHang = nameCuaHang;
        this.desCuaHang = desCuaHang;
        this.imageCuaHang = imageCuaHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCuaHang() {
        return nameCuaHang;
    }

    public void setNameCuaHang(String nameCuaHang) {
        this.nameCuaHang = nameCuaHang;
    }

    public String getDesCuaHang() {
        return desCuaHang;
    }

    public void setDesCuaHang(String desCuaHang) {
        this.desCuaHang = desCuaHang;
    }

    public String getImageCuaHang() {
        return imageCuaHang;
    }

    public void setImageCuaHang(String imageCuaHang) {
        this.imageCuaHang = imageCuaHang;
    }
}
