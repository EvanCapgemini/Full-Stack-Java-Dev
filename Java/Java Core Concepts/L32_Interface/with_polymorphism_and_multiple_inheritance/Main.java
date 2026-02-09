package L32_Interface.with_polymorphism_and_multiple_inheritance;

public class Main {
    public static void main(String[] args) {
        Iphone p = new Iphone();
        System.out.println(p.processor());
        System.out.println(p.space()+"GB");
        System.out.println(p.airDrop());
    }
}
