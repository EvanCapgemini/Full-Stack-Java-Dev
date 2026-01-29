package L31_polymorphism.exercise.animals.birds;

public class Eagle extends Birds{
    public String showInfo(){
        return "Eagle [feather : "+feather+", can fly : "+canFly+", height in feet : "+heightInFeet+", weight in kilos : "+weightInKilos+", animal type : "+animalType+", blood type : "+bloodType+"]";
    }
}
