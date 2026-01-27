package L28_Inheritance.Part4;
import L28_Inheritance.Part4.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Petrol", 2, 2, 15, "LED", "2");
        System.out.println(bike);
        System.out.println(bike.run());
    }
}

/*
Notes:-

In Bike class, on using toString method, by printing bike, we get only bike information.
So if we want information from parent as well, then we need to make use of super.toString in Bike class toString method.
*/
