class Animal {

    protected String name, sound, action;
    public Animal(String name,String sound,String action){
        this.name=name;
        this.sound=sound;
        this.action=action;
    }

    public void action(){

        System.out.println(name + " is "+ action);

    }

    public void speak(){

        System.out.println(name + " is" + sound);

    }

}


public class Poly {

    public static void main(String[] args) {

    }

}
