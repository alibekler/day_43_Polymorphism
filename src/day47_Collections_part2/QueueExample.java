package day47_Collections_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Orange");
        queue.add("Banana");
        queue.add("Kiwi");

        System.out.println(queue);

        //unlike stack queue removes the first inserted element first
        queue.remove();

        System.out.println(queue);

        String fruit = queue.remove();
        System.out.println(fruit);

        System.out.println(queue);

        //poll() also removes the first  element inserted to the list
        //pol() returns null if element is empty
        fruit = queue.poll();
        System.out.println(fruit);

        System.out.println(queue);

        //get the element at the front of the queue without removing it using peek()
        fruit  = queue.peek();
        System.out.println(fruit);
        System.out.println(queue);




    }
}

