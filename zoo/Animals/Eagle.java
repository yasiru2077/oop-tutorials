package zoo.Animals;

public class Eagle extends Bird{
    public Eagle(String name, int age, String species, String habitat, double wingSpan) {
        super(name, age, species, habitat, wingSpan);
    }


    @Override
    public void makeSound() {
        System.out.println(getName()+" screeching");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating fish");
    }

    public void hover(){
        System.out.println(getName() + " is hovering in the sky!");
    }

}
