package L32_Interface.with_polymorphism_and_multiple_inheritance;

public class Samsung implements Phone, Android{
    public String processor(){
        return "SD1000";
    }
    public int space(){
        return 256;
    }
    public String price(){
        return "Cheaper than an Iphone.";
    }
}
