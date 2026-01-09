package legendOfLink;

public abstract class Character {
    private String name;
    private int health;

    public Character(String name,int health){
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
        if(this.health < 0){
            this.health = 0;
        }
        System.out.println(name+" take "+ damage+" damage! HP left: "+health);
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public abstract void attack(Character target);




}
