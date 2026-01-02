package zoo;


import zoo.Animals.Animal;

import java.util.ArrayList;

public class Zoo {

    static final String zooName = "SuperWild Zoo";

    private final ArrayList<Enclosure> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList<>();
    }

    public void addEnclosure(Enclosure e) {
        enclosures.add(e);
    }

    public void openZoo() {
        System.out.println("\n=== Welcome to " + zooName + " ===\nOpening the zoo...");
        for (Enclosure enclosure : enclosures) {
            for (Animal animal : enclosure.getAnimals()) {
                animal.makeSound();
            }
        }

    }

    public void feedAllAnimals() {
        System.out.println("\nFeeding time!");
        for (Enclosure enclosure : enclosures) {
            for (Animal animal : enclosure.getAnimals()) {
                animal.eat();
            }
        }
    }

    public void showAllEnclosures() {
        for (Enclosure enclosure : enclosures) {
            enclosure.showAllAnimals();
        }
    }

}
