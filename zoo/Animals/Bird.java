package zoo.Animals;

public abstract class Bird extends Animals {

    private double wingSpan;

    public Bird(String name, int age, String species, String habitat, double wingSpan) {
        super(name, age, species, habitat);
        this.wingSpan = wingSpan;
    }



}
