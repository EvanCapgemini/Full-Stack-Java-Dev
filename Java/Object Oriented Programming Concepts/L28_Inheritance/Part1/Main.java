package L28_Inheritance.Part1;

import L28_Inheritance.Part1.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.handles = "Rubber material";
        bike.wheels = 2;
        bike.seats = 2;
        bike.engine = "Petrol";
        System.out.println("Bike Information: \n"+bike.handles+"\n"+bike.wheels+"\n"+bike.seats+"\n"+bike.engine);
    }
}
