package legendofZelda;

public class Warrior extends Character {

    private int stamina;


    public Warrior(String name,int hp, int stamina) {
        super(name,hp);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public void takeDamage() {
        System.out.println("hey");
    }

    @Override
    public void attack() {
        System.out.println("Swings a sword!");
    }

}
