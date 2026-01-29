package L31_polymorphism.exercise.animals.reptiles;

import L31_polymorphism.exercise.animals.Animals;

public class Reptiles extends Animals {
    protected String skin, egg;
    protected boolean backbone;

    public Reptiles() {
        heightInFeet = 5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "cold";
        this.skin = "dry";
        this.egg = "soft shelled";
        this.backbone = true;
    }

    public String showInfo(){
        return "Reptile [skin : "+skin+", egg : "+egg+", backbone : "+backbone+" , height in feet : "+heightInFeet+", weight in kilos : "+weightInKilos+", animal type : "+animalType+", blood type : "+bloodType+"]";
    }
}
