package L28_Inheritance.Part5_types.animals.reptile;

public class Crocodile extends Reptile{

    private String habitat;
    private String location;

    public Crocodile(int height, int weight, String animalType, String bloodType, boolean drySkin, String egg_type, String habitat, String location) {
        super(height, weight, animalType, bloodType, drySkin, egg_type);
        this.habitat = habitat;
        this.location = location;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "habitat='" + habitat + '\'' +
                ", location='" + location + '\'' +
                '}'+"\n"+super.toString();
    }
}
