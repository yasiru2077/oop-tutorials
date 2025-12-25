package zoo.Animals;

public class Crocodile extends Reptile {

    public Crocodile(String name, int age, String species, String habitat, boolean venomous) {
        super(name, age, "Crocodile", "Lake", venomous);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " growls");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats larger prey.");
    }

    public void swim(){
        System.out.println(getName() + " stalking prey while floating.");
    }

}
