package zoo.Animals;

public class Elephant extends Mammal {
    public Elephant(String name, int age, String species, String habitat, boolean hasFur) {
        super(name, age, species, habitat, hasFur);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Trumpets.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats banana leaves.");
    }

    public void migrating() {
        System.out.println(getName() + " migrating into a watering hole.");
    }

}
