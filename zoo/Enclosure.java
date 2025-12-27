package zoo;

import zoo.Animals.Animals;

import java.util.ArrayList;

public class Enclosure {

    private String type;
    private int capacity;
    private ArrayList<Animals> animals;

    public Enclosure(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public boolean addAnimal(Animals a){
        if(animals.size() < capacity){
            animals.add(a);
            return true;
        }else {
            System.out.println("Enclosure " + type + " is full!");
            return false;
        }
    }

    public void showAllAnimals() {
        System.out.println("\n--- " + type + " Enclosure ----");
        for (Animals animal : animals){
            animal.displayInfo();
            animal.makeSound();
        }
    }

    public ArrayList<Animals> getAnimals(){
        return animals;
    }

    public String getType(){
        return type;
    }




}
