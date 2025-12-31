package zoo.Animals;

public class Crocodile extends Reptile {
    public Crocodile(String name, int age, String species, String habitat, boolean venomous) {
        super(name, age, species, habitat, venomous);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " growls");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating meat");
    }

    public void hunt() {
        System.out.println(getName() + " sun beating.");
    }

}