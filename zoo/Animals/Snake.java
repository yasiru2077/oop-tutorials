package zoo.Animals;

public class Snake extends Reptile {

    public Snake(String name, int age, boolean venomous) {
        super(name, age,"Snake","Reptile House", venomous);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " hisses!");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats rodents.");
    }
}
