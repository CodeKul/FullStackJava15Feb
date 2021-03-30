package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();//default size arraylist 10
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        ListIterator<Integer> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }




    }
}
