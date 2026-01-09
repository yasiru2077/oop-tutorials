package legendOfLink;

public class Mage extends Character{

    private int spellPower = 15;

    public Mage(String name){
        super(name,70);

    }

    @Override
    public void attack(Character target) {
        System.out.println(getName()+ "cast a Fireball at "+target.getName()+"!");
        target.takeDamage(spellPower);
    }

}
