package L31_polymorphism.exercise.animals;

public class Animals {
    protected float heightInFeet;
    protected float weightInKilos;
    protected String animalType;
    protected String bloodType;

    public Animals() {
        this.heightInFeet = 0;
        this.weightInKilos = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public String showInfo(){
        return "Animal [height in feet : "+heightInFeet+", weight in kilos : "+weightInKilos+", animal type : "+animalType+", blood type : "+bloodType+"]";
    }
}
