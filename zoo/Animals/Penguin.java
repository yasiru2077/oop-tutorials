package zoo.Animals;

public class Penguin extends Bird{

    public Penguin(String name, int age, String species, String habitat, double wingSpan) {
        super(name, age, species, habitat, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" cries");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats salmons.");
    }

    public void flap(){
        System.out.println(getName()+" flapping his wings");
    }

}