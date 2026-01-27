package L24_instance_variable_default_values;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.doors);
        System.out.println(car.speed);
        System.out.println(car.test1);
        System.out.println(car.test2);

    }
}

/*
Notes:-

Default values:
String --> null
int --> 0
float --> 0.0
boolean --> false
*/
