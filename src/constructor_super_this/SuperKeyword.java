package constructor_super_this;

public class SuperKeyword {

    public static void main(String[] args) {
      B b = new B();
        System.out.println(b.i);
        b.show();
    }
}


class A extends Object{

    int i=10;

    public A(){
        System.out.println("In A constructor");
    }

}

class B extends A{

    int i=20;


    public B(){

        System.out.println("In B constructor");
    }

    public void show(){
        System.out.println(super.i);
    }

}