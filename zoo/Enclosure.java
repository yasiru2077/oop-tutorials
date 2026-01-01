package zoo;

import zoo.Animals.Animal;

import java.util.ArrayList;

public class Enclosure {

    public String type;
    private int capacity;
    private ArrayList<Animal> animals;

    public Enclosure(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public boolean addAnimal(Animal a) {

        if (animals.size() < capacity) {
            animals.add(a);
            return true;
        } else {
            System.out.println("Enclosure is already full.");
            return false;
        }

    }

    public void showAllAnimals() {
        System.out.println("\n--- " + type + "Enclosure ---");
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
        }
    }

}
