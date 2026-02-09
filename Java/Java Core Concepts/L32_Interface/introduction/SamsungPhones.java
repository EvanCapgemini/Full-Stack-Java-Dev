package L32_Interface.introduction;

public class SamsungPhones implements Phones{
    public String processor(){
        return "SD1000";
    }

    @Override
    public int spaceInGB() {
        return 256;
    }

}
