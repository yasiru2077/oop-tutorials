package zoo;

import zoo.Animals.Animal;

import java.util.ArrayList;

public class Enclosure {

    public String type;
    private int capacity;
    private ArrayList<Animal> animals;

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

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
