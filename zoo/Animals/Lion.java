package zoo.Animals;

public class Lion extends Mammal {

    public Lion(String name, int age) {
        super(name, age, "Lion", "cave", false);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " roars loudly!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats meat.");
    }

    public void hunt(){
        System.out.println(getName() + " is hunting in the savanna.");
    }

}
