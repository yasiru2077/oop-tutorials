package zoo.Animals;

public class Lion extends Mammal {

    public Lion(String name, int age, String species, String habitat, boolean hasFur) {
        super(name, age, species, habitat, hasFur);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Roars.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating a carcass.");
    }

    public void stocking(){
        System.out.println(getName()+" stocking a prey.");
    }

}