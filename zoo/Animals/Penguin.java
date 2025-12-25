package zoo.Animals;

public class Penguin extends Bird {

    public Penguin(String name, int age) {
        super(name, age, "Penguin", "Antarctic", 0.8);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " honks!");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats fish.");
    }

    public void swim(){
        System.out.println(getName() + " is swimming gracefully.");
    }

}
