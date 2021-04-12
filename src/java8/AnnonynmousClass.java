package java8;

public class AnnonynmousClass{

    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface() {
            @Override
            public String msg() {
                return "hello";
            }
        };

        System.out.println(myInterface.msg());

    }

}


//If interface contains only one abstract method then this is functional interface
@FunctionalInterface
interface MyInterface{

    String msg();

    String toString();


}
