package day48_Collections_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MApExample {
    public static void main(String[] args) {

        List<Integer> item2 = new ArrayList<>();
        item2.add(10);
        item2.add(11);
        item2.add(20);
        item2.add(15);

        Map<String, Double> items = new HashMap<>();
        items.put("Apple", 3.49);
        items.put("Orange", 4.99);
        items.put("Banana", 1.59);
        items.put("Blueberry", 4.49);
        items.put("Raspberry", 4.69);
        items.put("Melon", 2.49);
        items.put("Apple", 5.59);
        items.put("Cherry", 5.99);
        System.out.println(items.size());
        System.out.println(items);

        System.out.println(items.isEmpty());

        System.out.println(items.get("Apple"));

        items.remove("Melon");

        System.out.println(items);

        System.out.println("Is Apples there? " + items.containsKey("Apple"));
        System.out.println("Flowers there ? " + items.containsKey("Flower"));

        items.replace("Raspberry", 2.99);
        System.out.println("Price of raspberry - " + items.get("Raspberry"));

        //increase the price of cherries by £2
        items.replace("Cherry", items.get("Cherry")+2);
        System.out.println("Cherry new price: " + items.get("Cherry"));



    }
}
