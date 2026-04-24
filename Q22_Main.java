// Q22. Inheritance + abstract + interface

abstract class Animal {
    abstract void sound();
}

interface Run {
    void run();
}

class Dog extends Animal implements Run {
    void sound() {
        System.out.println("Bark");
    }

    public void run() {
        System.out.println("Dog runs");
    }
}

public class Q22_Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.run();
    }
}
