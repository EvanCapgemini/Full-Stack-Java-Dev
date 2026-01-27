package L25_adding_functionality_to_classes;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDoors("open");
        car.setEngine("off");
        car.setDriver("standing");
        car.setSpeed(0);
        System.out.println(car.run());
        System.out.println("The car doors are "+car.getDoors());
    }
}

/*
Notes:-

set --> Used to assign values.
get --> Used to retrieve certain values.
*/
