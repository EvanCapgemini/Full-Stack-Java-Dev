package L32_Interface.introduction;

public class IPhones implements Phones{
    public String processor(){
        return "A15";
    }

    @Override
    public int spaceInGB() {
        return 128;
    }
}

/*
Notes:-

@Override --> Overridden either from the base class or implementing from an interface.
*/
