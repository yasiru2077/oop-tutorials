package zoo.Animals;

public abstract class Animals {

    private String name;
    private int age;

    private String species;

    protected String habitat;

    public static final String PLANET = "Earth";


    public Animals(String name, int age, String species, String habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
    }

    private void breathe() {
        System.out.println(name + " is breathing...");
    }

    public abstract void makeSound();

    public abstract void eat();

    public void displayInfo() {
        breathe();
        System.out.println("Name: " + name + ", Age: " + age + ", Species: " + species + ", Habitat: " + habitat + ", From planet: " + PLANET);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


}
