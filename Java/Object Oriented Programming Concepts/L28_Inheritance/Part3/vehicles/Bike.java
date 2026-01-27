package L28_Inheritance.Part3.vehicles;

public class Bike extends Vehicles {

    private String handles;

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handles) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handles = handles;
    }

    public void setHandles(String handles){
        this.handles = handles;
    }
    public String getHandles(){
        return handles;
    }
}

/*
Notes:-

When creating a parameterised constructor for a class that extends the parent class, super keyword is used to access said values.
*/