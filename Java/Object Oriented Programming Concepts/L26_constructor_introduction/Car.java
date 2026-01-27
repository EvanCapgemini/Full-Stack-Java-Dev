package L26_constructor_introduction;

public class Car {

    //You can initialize values here itself, but it is not good practice, that's where we make use of a constructor.
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    //Constructor: (Custom)
    /*
    public Car() {
        doors = "closed";
        engine = "on";
        driver = "seated";
        speed = 100;
    }
    */

    //Constructor: (Generated)
    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0){
            return "Running";
        }
        else{
            return "Not running.";
        }
    }
}
