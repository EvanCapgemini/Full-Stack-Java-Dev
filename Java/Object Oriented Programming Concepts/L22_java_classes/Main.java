package L22_java_classes;

public class Main {
    public static void main(String[] args) {
        //Creating Car object.
        Car car = new Car();
        //Accessing variables in Car class.
        car.speed = 100;
        System.out.println("Speed:"+car.speed);
    }
}

/*
Notes-

* When creating an object, new keyword is used.
syntax:
//Object creation
object_name reference_name = new object_name();
//Access
reference_name.(whatever you are accessing)
*/