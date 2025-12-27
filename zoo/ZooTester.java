package zoo;

import zoo.Animals.*;

public class ZooTester {

    public static void main(String[] args) {

        Lion leo = new Lion("Leo", 8);
        Elephant jumbo = new Elephant("Jumbo", 15);

        Penguin pingu = new Penguin("Pingu", 5);
        Eagle sky = new Eagle("Sky", 7);

        Snake sly = new Snake("Sly", 4, true);
        Snake cozy = new Snake("Cozy", 3, false);

        Enclosure savanna = new Enclosure("Savanna", 3);
        Enclosure aviary = new Enclosure("Aviary", 3);
        Enclosure reptileHouse = new Enclosure("Reptile House", 3);

        savanna.addAnimal(leo);
        savanna.addAnimal(jumbo);

        aviary.addAnimal(pingu);
        aviary.addAnimal(sky);

        reptileHouse.addAnimal(sly);
        reptileHouse.addAnimal(cozy);

        Zoo zoo = new Zoo();
        zoo.addEnclosure(savanna);
        zoo.addEnclosure(aviary);
        zoo.addEnclosure(reptileHouse);

        System.out.println("Polymorphism demo with Animal array:");
        Animals[] allAnimals = {leo, jumbo, pingu, sky, sly, cozy};

        for (Animals a : allAnimals) {
            a.makeSound();
        }

        zoo.openZoo();
        zoo.feedAllAnimals();
        zoo.showAllEnclosures();

    }

}
