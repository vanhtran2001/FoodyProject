package hcmute.spkt.nhom12.washdish_12;

public class CuaHangItem {
    private int imageCuaHang;
    private String nameCuaHang;
    private String desCuaHang;

    public CuaHangItem(int anhCuaHang, String tenCuaHang, String moTaCuaHang) {
        imageCuaHang = anhCuaHang;
        nameCuaHang = tenCuaHang;
        desCuaHang = moTaCuaHang;
    }

    public int getImageCuaHang() {
        return imageCuaHang;
    }

    public String getNameCuaHang() {
        return nameCuaHang;
    }

    public String getDesCuaHang() {
        return desCuaHang;
    }
}
