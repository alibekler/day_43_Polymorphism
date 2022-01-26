package day47_Collections_part2;

import day46_collection_part1.LinkList;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> numStack = new Stack<>();
        numStack.add(30);
        numStack.add(12);
        numStack.add(30);
        numStack.add(98);
        numStack.add(10);
        numStack.add(10);
        numStack.add(100);

        System.out.println(numStack.toString());

        //gives last element inserted
        System.out.println(numStack.peek());

        //read value on top of stack then remove it
        numStack.pop();

        System.out.println(numStack);

        System.out.println(((Stack<Integer>) numStack).peek());


        Stack<Integer> stack2 = new Stack<>();

        stack2.add(132);
        stack2.add(11);
        stack2.add(52);
        System.out.println("started stack2: " + stack2);
        System.out.println(stack2.pop());
        System.out.println(stack2);

        System.out.println(stack2.peek());
        System.out.println(stack2);




        System.out.println("**************");





        Queue<Integer> queue = new LinkedList<>();

        queue.offer(121);
        queue.offer(11);
        queue.offer(21);
        queue.offer(221);
        queue.offer(1221);


        System.out.println("queue " + queue);

        System.out.println(queue.poll());

        System.out.println(queue.poll());
        System.out.println("queue = " + queue);

        System.out.println("queue = " + queue.peek());
        System.out.println("queue = " + queue);
    }
}
