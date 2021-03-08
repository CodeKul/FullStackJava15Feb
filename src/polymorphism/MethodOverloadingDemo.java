package polymorphism;


public class MethodOverloadingDemo {//static binding,compile time polymorphism


    int c = 0;

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        demo.add(1, 2);
    }

    public int showDisplay() {
        return 1;
    }

    public void show(int i) {
        System.out.println("In show 2");

    }

    public void add(int i, int j) {
        c = i + j;
    }

    public void add(int i, int j, int k) {
        c = i + j + k;
    }

    public void add(int i, int j, int k, int l) {
        c = i + j + k + l;
    }


}

class MethodOverriding extends MethodOverloadingDemo {//dynamic binding , runtime polymorphism

    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding();

        methodOverriding.show(9);
    }

    public void show(int i) {
        System.out.println("In Method overriding");
    }
}
