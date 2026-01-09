package legendOfLink;

public class Warrior extends Character{

    private int swordStrength = 25;
    public Warrior(String name) {
        super(name, 100);
    }

    @Override
    public void attack(Character target) {
        System.out.println(getName()+" swings a heavy sword at " + target.getName() + "!");
        target.takeDamage(swordStrength);
    }
}
