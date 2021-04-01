package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        //FIFO
        Queue<Integer> queue = new PriorityQueue<>();

//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);

        System.out.println(queue.peek());
        System.out.println(queue.poll());//null
        System.out.println(queue.remove());//exception
//        queue.clear();
        System.out.println(queue);


    }
}
