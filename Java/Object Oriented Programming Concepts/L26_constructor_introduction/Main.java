package L26_constructor_introduction;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car(); //Used when using default/custom constructor.
        Car car = new Car("closed", "off", "away", 0); //Used when using generated constructor.
        System.out.println(car.run());
        System.out.println("The car doors are "+car.getDoors());
    }
}
