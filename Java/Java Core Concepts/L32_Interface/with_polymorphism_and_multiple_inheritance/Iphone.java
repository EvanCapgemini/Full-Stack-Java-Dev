package L32_Interface.with_polymorphism_and_multiple_inheritance;

public class Iphone implements Phone, IOS{
    public String processor(){
        return "A17";
    }
    public int space(){
        return 128;
    }
    public String airDrop(){
        return "Copy and Paste anywhere.";
    }
}
