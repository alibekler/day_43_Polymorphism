package day47_Collections_part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoopSet{

    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();

        nums.add(20);
        nums.add(30);
        nums.add(2200);
        nums.add(21);
        nums.add(205);
        nums.add(3004);
        nums.add(2000);
        nums.add(210);

        for (int num : nums) {
            System.out.print(num + " | ");
        }

        System.out.println();

        nums.forEach(n -> System.out.print(n + " | "));


    }

}
