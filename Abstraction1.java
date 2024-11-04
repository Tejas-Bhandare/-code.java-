
public class Abstraction1 {

    public static void main(String args[]) {

        Horse Myhorse = new Mustang();
        Myhorse.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("horse constructor called");
    }

    void walk() {
        System.out.println("Wlks on 4 legs");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }

    void walk() {
        System.out.println("mustang runs faster");
    }
}