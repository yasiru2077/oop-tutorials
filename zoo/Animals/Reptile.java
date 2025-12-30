package zoo.Animals;

public abstract class Reptile extends  Animal{
    private boolean vanomous;

    public Reptile(String name, int age, String species, String habitat, boolean vanomous) {
        super(name, age, species, habitat);
        this.vanomous = vanomous;
    }

}


