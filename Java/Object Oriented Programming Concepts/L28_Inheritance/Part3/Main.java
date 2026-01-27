package L28_Inheritance.Part3;

import L28_Inheritance.Part3.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("petrol", 2, 2, 15, "LED", "2");
        System.out.println("Bike Information:\n"+bike.getEngine()+"\n"+bike.getWheels()+"\n"+bike.getSeats()+"\n"+bike.getFuelTank()+"\n"+bike.getLights()+"\n"+bike.getHandles());

    }
}
