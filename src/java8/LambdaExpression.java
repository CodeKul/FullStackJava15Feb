package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExpression {


    public static void main(String[] args) {

        MyInterface1 myInterface1 = ()-> {
                return "Hello";
        };

        System.out.println(myInterface1.show());


        MyInterface2 myInterface2 = (i,j)-> i+ j;


        System.out.println(myInterface2.add(2,7));


        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Consumer<Integer> consumer = (integer) ->{
                System.out.println(integer);
        };

        list.forEach(consumer);
    }
}

@FunctionalInterface
interface MyInterface1{
    String show();
}

@FunctionalInterface
interface MyInterface2{

    Integer add(int i,int j);
}