package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAList_Comparable_intrfc {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("js");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("c++");

        System.out.println("Before sorting");
        System.out.println(list.toString());

        System.out.println("After sorting ");
        Collections.sort(list);
        System.out.println(list.toString());

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product("spoon", 200));
        prodList.add(new Product("bag", 20));
        prodList.add(new Product("laptop", 2100));
        prodList.add(new Product("macbook pro", 300));
        prodList.add(new Product("iCar", 20900));
        prodList.add(new Product("speakers", 200));


        System.out.println("Before sorting");
        System.out.println(prodList.toString());

        Collections.sort(prodList);

        System.out.println("After sorting");
        System.out.println(prodList);



    }

}
