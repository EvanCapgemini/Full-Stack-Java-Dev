package L32_Interface.introduction;

public class Main {
    public static void main(String[] args) {
        SamsungPhones sp = new SamsungPhones();
        String p1 = sp.processor();
        System.out.println(p1);
        System.out.println(sp.spaceInGB());

        IPhones ip = new IPhones();
        String p2 = ip.processor();
        System.out.println(p2);
        System.out.println(ip.spaceInGB());
    }
}

