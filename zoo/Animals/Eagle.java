package zoo.Animals;

public class Eagle extends Bird {

    public Eagle(String name, int age) {
        super(name, age,"Eagle","Mountain",2.0);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches!");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats small mammals.");
    }

    public void fly(){
        System.out.println(getName() + " soars high in the sky.");
    }

}
