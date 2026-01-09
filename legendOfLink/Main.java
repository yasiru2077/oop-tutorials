package legendOfLink;

public class Main {
    public static void main(String[] args) {
        Character hero = new Warrior("Aragorn");
        Character monster = new Mage("Dark Wizard");

        System.out.println("--- Battle Start! ---");

        while (hero.isAlive() && monster.isAlive()) {
            hero.attack(monster);

            if (monster.isAlive()) {
                monster.attack(hero);
            }

            System.out.println("------------------");

        }

        if (hero.isAlive()) {
            System.out.println(hero.getName() + " is victorious!");
        } else {
            System.out.println(hero.getName() + " has fallen....");
        }

    }
}
