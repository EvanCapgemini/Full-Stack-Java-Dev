package L29_composition.Part2_working;

import L29_composition.Part2_working.laptop.Laptop;
import L29_composition.Part2_working.laptop.components.GraphicsCard;
import L29_composition.Part2_working.laptop.components.Processor;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor()); //Gives me all values within processor class.
        //If I want a specific value within processor class:
        System.out.println(laptop.getProcessor().getCacheMemory());

        //Making use of Parameterized constructor:-
        Processor p = new Processor();
        GraphicsCard gc = new GraphicsCard();
        Laptop l = new Laptop(14.6f, p, "DDR5", "1 TB", gc, "Single Layer", "front-lit");
        System.out.println(l);
    }
}
