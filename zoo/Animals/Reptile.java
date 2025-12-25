package zoo.Animals;

public abstract class Reptile extends Animals {
    private boolean venomous;

    public Reptile(String name, int age, String species, String habitat, boolean venomous) {
        super(name, age, species, habitat);
        this.venomous = venomous;
    }

    public boolean isVenomous(){
        return venomous;
    }

    public void setVenomous(boolean venomous){
        this.venomous = venomous;
    }



}
