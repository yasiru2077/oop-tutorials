package legendofZelda;

public abstract class Character {

    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public abstract void takeDamage();

    public void attack() {
        System.out.println("each faction attack in a unique way");
    }


}
