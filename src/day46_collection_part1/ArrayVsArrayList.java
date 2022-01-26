package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        int[] numArray = {30, 50, 100, 5, 6};
        String[] days = new String[7];
        days[0] = "Monday";

        Object[] obj = {2, "apple", false};

        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();

        list1.add(40);
        list1.add(50);
        list1.add(100);

        System.out.println(numArray[0]);
        System.out.println(list1.get(0));

    }
}
