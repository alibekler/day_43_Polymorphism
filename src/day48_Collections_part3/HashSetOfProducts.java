package day48_Collections_part3;

import day46_collection_part1.Product;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts  {
    public static void main(String[] args) {

        Set<Product> prod = new HashSet<>();

        prod.add(new Product("Gucci", 3999));
        prod.add(new Product("Armani", 2099));
        prod.add(new Product("Luis Vuitton", 5999));
        prod.add(new Product("iPhone", 1999));


        System.out.println(prod + "   |   ");

        for (Product product : prod) {
            System.out.println(product.getPrice());
        }

        //below, both declarations are ok
        prod.forEach(System.out::println);
        prod.forEach(n-> System.out.println(n.getPrice()));
      // prod.forEach(n -> System.out.print(n + "  ||  "));



    }
}
