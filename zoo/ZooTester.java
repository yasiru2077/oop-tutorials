package zoo;

import zoo.Animals.*;

public class ZooTester {

    public static void main(String[] args) {
        Lion leo = new Lion("Leo", 8, "lion", "Savanna", true);
        Elephant jumbo = new Elephant("Jumbo", 15, "elephant", "Savanna", false);
        Penguin pingu = new Penguin("Pingu", 5, "penguin", "Aviary", 1.5);
        Eagle sky = new Eagle("Sky", 7, "eagle", "Aviary", 3.75);

        Snake sly = new Snake("Sly", 4, "cobra", "Reptile House", true);
        Snake cozy = new Snake("Cozy", 3, "python", "Reptile House", false);
        Crocodile mina = new Crocodile("mina", 48, "reptile", "Reptile House", false);

        Enclosure savanna = new Enclosure("Savanna", 3);
        Enclosure aviary = new Enclosure("Aviary", 3);
        Enclosure reptileHouse = new Enclosure("Reptile House", 3);

        savanna.addAnimal(leo);
        savanna.addAnimal(jumbo);

        aviary.addAnimal(pingu);
        aviary.addAnimal(sky);

        reptileHouse.addAnimal(sly);
        reptileHouse.addAnimal(cozy);
        reptileHouse.addAnimal(mina);

        Zoo zoo = new Zoo();
        zoo.addEnclosure(savanna);
        zoo.addEnclosure(aviary);
        zoo.addEnclosure(reptileHouse);

        zoo.openZoo();
        zoo.feedAllAnimals();
        zoo.showAllEnclosures();

        System.out.println();
        System.out.println("What are they doing now?");
        System.out.println();
        leo.stocking();
        jumbo.migrating();
        pingu.flap();
        sky.hover();
        sly.resting();
        cozy.resting();
        mina.hunt();


    }
}
