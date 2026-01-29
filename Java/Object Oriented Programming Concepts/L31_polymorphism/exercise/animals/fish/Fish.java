package L31_polymorphism.exercise.animals.fish;

import L31_polymorphism.exercise.animals.Animals;

public class Fish extends Animals {
    protected boolean waterborne;
    protected boolean gills;

    public Fish() {
        animalType = "Fish";
        this.waterborne = true;
        this.gills = true;
    }

    public String showInfo(){
        return "Fish [water-borne : "+waterborne+", gills : "+gills+", height in feet : "+heightInFeet+", weight in kilos : "+weightInKilos+", animal type : "+animalType+", blood type : "+bloodType+"]";
    }
}
