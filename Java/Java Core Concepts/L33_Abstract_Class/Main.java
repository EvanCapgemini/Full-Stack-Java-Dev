package L33_Abstract_Class;

public class Main {
    public static void main(String[] args) {
        Person j = new John();
        j.speak();
        j.eat();
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("Eat your food!");
            }
        };
        p.speak();
        p.eat();
    }
}

/*
Notes:-

* Abstraction means, we can declare the methods, but their implementation will be done later.
* In Interface, we can't have implementation. But in abstract class, we can have.
*/