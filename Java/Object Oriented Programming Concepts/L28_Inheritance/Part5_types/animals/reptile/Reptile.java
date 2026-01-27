package L28_Inheritance.Part5_types.animals.reptile;

import L28_Inheritance.Part5_types.animals.Animals;

public class Reptile extends Animals {

    private boolean drySkin;
    private String egg_type;

    public Reptile(int height, int weight, String animalType, String bloodType, boolean drySkin, String egg_type) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.egg_type = egg_type;
    }

    public boolean isDrySkin() {
        return drySkin;
    }

    public void setDrySkin(boolean drySkin) {
        this.drySkin = drySkin;
    }

    public String getEgg_type() {
        return egg_type;
    }

    public void setEgg_type(String egg_type) {
        this.egg_type = egg_type;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "drySkin=" + drySkin +
                ", egg_type='" + egg_type + '\'' +
                '}'+"\n"+super.toString();
    }
}
