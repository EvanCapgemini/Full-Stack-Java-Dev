package L23_getters_and_setters;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDoors(4);
        System.out.println(car.getDoors()); //Gives value 0, why? Check package L24.
    }
}

/*
Notes:-

* Object is also called as Instance.
*/
