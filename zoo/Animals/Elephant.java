package zoo.Animals;

public class Elephant extends Mammal {

    public Elephant(String name, int age) {
        super(name, age, "Elephant","grasslands" , false);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets!");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats plants.");
    }

    public void migrate(){
        System.out.println(getName() + " migrating to water holes.");
    }

}
