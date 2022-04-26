package hcmute.spkt.nhom12.washdish_12;

public class MonAnItem {
    private int imageMonAn;
    private String nameMonAn;
    private  String DesMonAn;
    private int giaMonAn;

    public MonAnItem(int imageMonAn, String nameMonAn, String desMonAn, int giaMonAn) {
        this.imageMonAn = imageMonAn;
        this.nameMonAn = nameMonAn;
        DesMonAn = desMonAn;
        this.giaMonAn = giaMonAn;
    }

    public int getImageMonAn() {
        return imageMonAn;
    }

    public void setImageMonAn(int imageMonAn) {
        this.imageMonAn = imageMonAn;
    }

    public String getNameMonAn() {
        return nameMonAn;
    }

    public void setNameMonAn(String nameMonAn) {
        this.nameMonAn = nameMonAn;
    }

    public int getGiaMonAn() {
        return giaMonAn;
    }

    public void setGiaMonAn(int giaMonAn) {
        this.giaMonAn = giaMonAn;
    }

    public String getDesMonAn() {
        return DesMonAn;
    }

    public void setDesMonAn(String desMonAn) {
        DesMonAn = desMonAn;
    }
}
