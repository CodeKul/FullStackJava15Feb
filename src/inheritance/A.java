package inheritance;


public class A {//Parent class, Base class ,Super class

//    int i;
//    int j;

    public void show(){
        System.out.println("In A class show");
    }
    public static void main(String[] args) {
        A a = new A();
    }
}

class B {//child class , derived class , sub Class
    public void show(){
        System.out.println("In A class show");
    }
    public static void main(String[] args) {
        B b =new B();
        b.show();
    }

}

class C extends B{

    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}