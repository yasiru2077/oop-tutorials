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



}
