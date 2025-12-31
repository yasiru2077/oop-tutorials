package zoo.Animals;

public abstract class Bird extends Animal{
    private double wingSpan;

    public Bird(String name, int age, String species, String habitat, double wingSpan) {
        super(name, age, species, habitat);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
