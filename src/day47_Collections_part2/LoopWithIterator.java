package day47_Collections_part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {



    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(290);
        nums.add(30);
        nums.add(2240);
        nums.add(21);
        nums.add(205);
        nums.add(3904);
        nums.add(2080);
        nums.add(240);

        //Create Iterator object
        Iterator<Integer> it = nums.iterator();

        //Call hasNext method
        //hasNext return true, if there is still next value
        //returns false if it reaches the end or empty

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //what is the difference between for each loop and iterator ???
        //we cn remove objects while looping

        Iterator<Integer> it2 = nums.iterator();

         while (it2.hasNext()){
            int num = it2.next();
            if (num>1000){
                it2.remove();
            }
        }

        System.out.println(nums);




    }
}
