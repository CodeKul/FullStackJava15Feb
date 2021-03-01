package control_statment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForLoopDemo {

    public static void main(String[] args) {

        //traditional for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hii");
        }

        int[] arr = {1, 23, 4, 45, 5, 66, 6};
        char[] chars = {'c', 'h', 'a', 'r'};

//        System.out.println(arr.length);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        for (int l = arr.length - 1; l >= 0; l--) {
            System.out.println(arr[l]);
        }

        //enhanced for loop
        for (int k : arr) {
            System.out.println(k);
        }

        for (char c : chars) {
            System.out.println(c);
        }

        //for each
        List<Integer> list = Arrays.asList(1, 2, 23, 3, 4);

        list.forEach(s -> {
            System.out.println(s);
        });
    }
}


//*
//* *
//* * *
//* * * *
//* * * * *

/*

* * * * *
* * * * *
* * * * *
* * * * *


 */
