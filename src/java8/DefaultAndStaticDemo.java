package java8;


interface MyInterface3 {

    static String add() {
        return "In Static";
    }

    String show();

    default String msg() {
        return "Hii";
    }
}

interface  MyInterface4{
   default String msg(){
       return "Hello";
   }

}
public class DefaultAndStaticDemo implements MyInterface3,MyInterface4 {

    public static void main(String[] args) {

        DefaultAndStaticDemo demo = new DefaultAndStaticDemo();
        System.out.println(demo.show());
        System.out.println(demo.msg());
        System.out.println(MyInterface3.add());
    }

    @Override
    public String show() {
        return "Show method";
    }

    @Override
    public String msg() {
        return "hii";
    }
}