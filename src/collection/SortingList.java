package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(223);
        list.add(2234);
        list.add(22433);
        list.add(23);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
