package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * stream api => stream api a sequence of objects and that have many methods and we combined and produce a desired result.
 * Types of Stream => Sequential stream and parallel stream(it used with multiple thread environment)
 * Operations -> terminal operation and intermediate operation
 * <p>
 * Terminal Operation => forEach(), reduce(),collect()
 * intermediate operation => map(function),filter(predicate),sorted()
 */

public class StreamDemo {
    public static void main(String[] args) {

        Student obj1 = new Student();
        obj1.id = 1;
        obj1.name = "Sachin";
        obj1.marks = 70;

        Student obj2 = new Student();
        obj2.id = 2;
        obj2.name = "Gaurav";
        obj2.marks = 50;

        Student obj3 = new Student();
        obj3.id = 3;
        obj3.name = "Ravi";
        obj3.marks = 90;

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
//
//        list.forEach(s->{
//            if(s.marks>=70){
//                System.out.println(s.name);
//            }
//        });

//        list.stream()
//                .filter(f->f.marks>=70)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);


        List<Integer> listMap = Arrays.asList(1,2,3,4,5,6,7);
        listMap.stream()
                .map(m->m*2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        List<Integer>listSort = Arrays.asList(123,23,33,4,15,62,73);
//        Collections.sort(listSort);
        listSort.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<String> stringList = Arrays.asList("java","is","Programming","Language");


    }
}

class Student {

    int id;
    String name;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}