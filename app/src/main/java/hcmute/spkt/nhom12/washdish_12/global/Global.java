package hcmute.spkt.nhom12.washdish_12.global;

public class Global {
    public static int id;
    public static String name;
    public static String phone;
    public static String adrs;


    public static void setId(int id){
        Global.id = id;
    }

    public static int getId() {
        return id;
    }

    public static void setName(String name){
        Global.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setPhone(String phone){
        Global.phone = phone;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setAdrs(String adrs){
        Global.adrs = adrs;
    }

    public static String getAdrs() {
        return adrs;
    }
}
