package L31_polymorphism.exercise.animals.birds;

import L31_polymorphism.exercise.animals.Animals;

public class Birds extends Animals {
    protected boolean feather = true;
    protected boolean canFly = true;

    public Birds() {
        this.feather = true;
        this.canFly = true;
    }
}
