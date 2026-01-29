package L30_encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John Doe", 29, "Male");
        System.out.println(p);
        p.setName("Evan Mendonsa");
        System.out.println(p);
        p.setAge(18);
        System.out.println(p);
    }
}

/*
Notes:-

Encapsulation --> restricting access to certain properties of an object.
*/
