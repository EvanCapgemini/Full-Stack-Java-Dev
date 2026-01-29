package L31_polymorphism.exercise.animals.reptiles;

public class Crocodile extends Reptiles{

    public Crocodile() {
        super();
        egg = "hard shelled";
    }

    public String showInfo(){
        return "Crocodile [skin : "+skin+", egg : "+egg+", backbone : "+backbone+" , height in feet : "+heightInFeet+", weight in kilos : "+weightInKilos+", animal type : "+animalType+", blood type : "+bloodType+"]";
    }
}
