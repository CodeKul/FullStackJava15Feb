package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printData(list);

        List<String> list1 = new ArrayList<>();
        list1.add("String-1");
        list1.add("String-2");
        list1.add("String-3");
        printData(list1);
    }

    private static void printData(List<?> list) { //any type
        list.forEach(s -> {
            System.out.println(s);
        });
    }

}
