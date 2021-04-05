package collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSize {

    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();//default size 10 -> 50% grow

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println(getCapacity(list));



    }

    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
