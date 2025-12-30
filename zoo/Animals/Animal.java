package zoo.Animals;

public abstract class Animal {

    private String name;
    private int age;
    private String species;
    protected String habitat;
    final static String PLANT = "Earth";

    public Animal(String name, int age, String species, String habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
    }

    private void breathe() {
        System.out.println(name + "is breathing...");
    }

    public void displayInfo() {
        breathe();
        System.out.println("Name: " + name + ", Age: " + age + ", Species: " + species + ", Habitat" + habitat + ", From planet: " + PLANT);

    }

    public  abstract void makeSound();
    public abstract void eat();

    public String getName() {
        return name;
    }


    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
