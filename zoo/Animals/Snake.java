package zoo.Animals;


public class Snake extends Reptile{


    public Snake(String name, int age, String species, String habitat, boolean venomous) {
        super(name, age, species, habitat, venomous);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" is hissing");

    }

    @Override
    public void eat() {
        System.out.println(getName()+" swallowing a rat");
    }

    public void resting(){
        System.out.println(getName()+" is resting");
    }

}