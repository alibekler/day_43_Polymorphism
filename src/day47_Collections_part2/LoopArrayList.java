package day47_Collections_part2;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(20);
        nums.add(30);
        nums.add(2200);
        nums.add(21);
        nums.add(205);
        nums.add(3004);
        nums.add(2000);
        nums.add(210);

        //loop using for each loop
        for (int num : nums) {
            System.out.print(num + "  ||  ");
        }

        System.out.println();
        //loop using for iterator loop
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + "  ||  ");
        }
        System.out.println();

        //loop using foreach method .Lambda expression
        nums.forEach(n -> System.out.print(n + "  ||  "));

        System.out.println();

         nums.removeIf(n -> n<500);
        nums.forEach(n -> System.out.print(n + "  ||  "));

    }
}
