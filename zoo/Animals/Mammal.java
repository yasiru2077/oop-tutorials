package zoo.Animals;

public abstract class Mammal extends Animal {
    private boolean  hasFur;

    public Mammal(String name, int age, String species, String habitat, boolean hasFur) {
        super(name, age, species, habitat);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
