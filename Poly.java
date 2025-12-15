
class Animal {
    public void action(){
        System.out.println("animal is going something!");
    }
}

class Dog extends Animal{
    @Override
    public void action(){
        System.out.println("Dog is peeing to a fence!");
    }
}

class Cat extends Animal {

    @Override
    public void action(){
        System.out.println("Cat is caching mice!");
    }
}



public class Poly {

    public static void main(String[] args) {
        Animal generic = new Animal();
        generic.action();
        Animal dog = new Dog();
        dog.action();
        Animal cat = new Cat();
        cat.action();


    }

}