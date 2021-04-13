package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesDemo {

    public static void main(String[] args) {
//
//        List<Integer> list =  new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        list.forEach(System.out::println);

//        MyInterface6 obj = MethodReferencesDemo::display;//for static method
//        System.out.println(obj.show());

        MethodReferencesDemo obj = new MethodReferencesDemo();
        MyInterface6 interface6 = obj::display;// non static method
        System.out.println(interface6.show());
    }

    private  String display(){
        return "Hello";
    }
}

interface MyInterface6{
    String show();
}
