package polymorphism;

public class MethodOverloadingDemo {

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        demo.show(1);

    }

    public int show() {
        return 1;
    }

    public void show(int i) {
        System.out.println("In show 2");
    }
}

class MethodOverriding extends MethodOverloadingDemo{

    public void show(int i) {
        System.out.println("In Method overriding");
    }

    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding();

        methodOverriding.show(9);
    }
}
