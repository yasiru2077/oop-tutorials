public class Main {

    public static void main(String[] args){
        Second enemy = new Second(25,"daffy");
        Second enemy2 = new Second();

        System.out.println("enemy is: "+enemy.enemyName + ". enemy level is: "+enemy.enemyLevel);
        System.out.println("enemy is: "+enemy2.enemyName + ". enemy level is: "+enemy2.enemyLevel);


    }

}

class Second {

    int enemyLevel;
    String enemyName;

    public Second() {
        this(24,"caviar");
    }

    public Second(int enemyLevel, String enemyName) {
        this.enemyLevel = enemyLevel;
        this.enemyName = enemyName;
    }
}
