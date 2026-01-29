package L31_polymorphism.exercise;

import L28_Inheritance.Part5_types.animals.reptile.Reptile;
import L31_polymorphism.exercise.animals.Animals;
import L31_polymorphism.exercise.animals.birds.Eagle;
import L31_polymorphism.exercise.animals.fish.Eel;
import L31_polymorphism.exercise.animals.reptiles.Crocodile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animals> animalsList = new ArrayList<>();

        Animals croc = new Crocodile();
        Animals eel = new Eel();
        Animals eagle = new Eagle();

        animalsList.add(croc);
        animalsList.add(eel);
        animalsList.add(eagle);

        listingAnimals(animalsList);
    }

    public static void listingAnimals(List<Animals> animalsList) {
        for(Animals animals : animalsList){
            System.out.println(animals.showInfo());
        }
    }
}
