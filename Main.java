public class Main {

    public static void main(String[] args){
        Second enemy = new Second(25,"daffy");
        Second enemy2 = new Second();

        System.out.println("enemy is: "+enemy.enemyName + ". enemy level is: "+enemy.enemyLevel);
        System.out.println("enemy is: "+enemy2.enemyName + ". enemy level is: "+enemy2.enemyLevel);

        Second.myStaticMethod();

        Student student1 = new Student();

        student1.study();

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

    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }





}

abstract class Third {

    public String fname = "john";
    public int age = 25;
    public abstract void study();

}

class Student extends Third {

    public int graduationYear = 2018;

    public void study(){
        System.out.println("name: "+fname+" age: "+age+" graduation year: "+graduationYear);
    }


}
