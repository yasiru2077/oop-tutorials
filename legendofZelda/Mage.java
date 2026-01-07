package legendofZelda;

public class Mage extends Character {

    private int mana;

    public Mage(String name, int hp, int mana) {
        super(name, hp);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }


    @Override
    public void takeDamage() {
        System.out.println();
    }

    @Override
    public void attack() {
        System.out.println("Casts a fireball!");
    }

}
