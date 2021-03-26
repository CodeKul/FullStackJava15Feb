package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetDemo {
    // set doesn't store the duplicate values
    //doesn't maintain insertion order
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);

        set.forEach(s -> {
            System.out.println(s);
        });

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(2);
        set1.add(3);

        set1.forEach(s -> {
            System.out.println(s);
        });
    }
}
