package abstraction;

interface AnimalInterface {

    public abstract void sound();

}


//if we have 2 or more methods in interface then this is called normal interface
//if we have 1 method in interface then this is called functional interface
//if no method in interface then it called marker interface
public class InterfaceDemo {


    public static void main(String[] args) {

        DogInterface dogInterface = new DogInterface();
        dogInterface.sound();
        CatInterface catInterface = new CatInterface();
        catInterface.sound();
    }
}

class DogInterface implements AnimalInterface {

    @Override
    public void sound() {
        System.out.println("Dog sound....");
    }
}

class CatInterface implements AnimalInterface {

    @Override
    public void sound() {
        System.out.println("Mauu...");
    }
}

