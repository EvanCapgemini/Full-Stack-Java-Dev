package L28_Inheritance.Part4.vehicles;

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

    @Override
    public String toString() {
        return "Bike{" +
                "handles='" + handles + '\'' +
                '}'+"\n"+super.toString();
    }

    @Override
    public String run(){
        return "Hi World!";
    }
}

/*
Notes:-

toString method --> Used to retrieve values in that particular class.
See the method run in both Bike and Vehicle class, if we only had a method in parent, then that would have run.
But when you have a method with same name in child, the child takes precedence over parent.
*/