package L28_Inheritance.Part2;
import L28_Inheritance.Part2.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("short");
        System.out.println("Handles:"+bike.getHandles());
        System.out.println("Wheels:"+bike.getWheels());
    }
}
