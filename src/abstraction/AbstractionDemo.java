package abstraction;


public class AbstractionDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.leg();

        Cat cat = new Cat();
        cat.sound();
        cat.leg();

    }
}

abstract class Animal {
//In abstract class we have abstract methods also non abstract methods

    abstract void sound();//decalre

    void leg() {         //define
        System.out.println("4 Legs");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog sound.....");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Mauuu");
    }
}

