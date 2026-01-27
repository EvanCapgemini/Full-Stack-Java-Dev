package L23_getters_and_setters;

public class Car {

    //These 4 are called (Local)Member variables.
    private int doors;
    private String engine;
    private String driver;
    private int speed;

    //Setter
    public void setDoors(int doors){
        doors = doors;
    }

    //Getter
    public int getDoors(){
        return doors;
    }
}

/*
Notes:-

public --> variable can be accessed outside this class.
private --> variable can't be accessed outside this class.

Setter syntax:
public void setVariable_Name(data-type variable_name){
...;
}

Getter syntax:
public data-type getVariable_Name(){
...;
}
*/
