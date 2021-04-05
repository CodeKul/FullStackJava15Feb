package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String address;


    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {

        ComparatorDemo obj1 = new ComparatorDemo(1, "Sachin", "Pune");
        ComparatorDemo obj2 = new ComparatorDemo(1, "Sachin", "Nashik");
        ComparatorDemo obj3 = new ComparatorDemo(3, "Akshay", "Sangli");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);


//        Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
//            @Override
//            public int compare(ComparatorDemo comparatorDemo, ComparatorDemo t1) {
//                if (comparatorDemo.id == t1.id) {
//                    return 0;
//                } else if (comparatorDemo.id > t1.id) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        };
//        Collections.sort(list,comparator);


        Collections.sort(
                list,
                Comparator.comparing(ComparatorDemo::getId)
                        .thenComparing(ComparatorDemo::getName)
                        .thenComparing(ComparatorDemo::getAddress)
        );

        list.forEach(s->{
            System.out.println("Id=>"+s.id+ " Name=>"+s.name+ " Address=>"+s.address);
        });

        // Collections.sort(list,(comparatorDemo,t1)-> {
//            if (comparatorDemo.id == t1.id) {
//                return 0;
//            } else if (comparatorDemo.id > t1.id) {
//                return 1;
//            } else {
//                return -1;
//            }
//        });

    }
}
