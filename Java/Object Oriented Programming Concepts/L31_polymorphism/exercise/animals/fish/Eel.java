package L31_polymorphism.exercise.animals.fish;

public class Eel extends Fish{
    private String special;

    public Eel() {
        super();
        this.special = "Releases electric shocks.";
    }

    public String showInfo(){
        return "Fish [special : "+special+", water-borne : "+waterborne+", gills : "+gills+", height in feet : "+heightInFeet+", weight in kilos : "+weightInKilos+", animal type : "+animalType+", blood type : "+bloodType+"]";
    }
}
