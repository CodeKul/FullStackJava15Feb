package collection;

import inheritance.A;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {


        // Arraylist uses dynamic array to store element
        // Arraylist maintain insertion order
        // Arraylist store duplicate element


//        int[] arr = new int[4];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);//3

        list.add(4, 5);
        list.add(5);

//        list.remove(4);

//        System.out.println(list.size());

//        list.clear();

        list.forEach(s -> {
            System.out.println(s);
        });


//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(4);
//        list2.add(5);
//        list2.add(6);
//
//
//        List<Integer> combine = new ArrayList<>();
//        combine.addAll(list1);
//        combine.addAll(list2);
//
//        System.out.println(combine);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);


        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        List<Integer> list4 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};


        //Linkedlist maintains the insertion order
        //Linkedlist store the duplicate element
        //Linked list uses the doubly linked list to store the element

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


    }
}
