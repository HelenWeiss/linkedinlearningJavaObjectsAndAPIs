package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // fruits will be added in right order: [apple, lemon, banana, orange]
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits); // [apple, lemon, banana, orange]
        System.out.println(fruits.get(2)); // banana (index: 0 1 2 3)

        fruits.set(2, "grape");
        System.out.println(fruits); // [apple, lemon, grape, orange] grape removed banana

        fruits.add("lemon");
        System.out.println(fruits); // [apple, lemon, grape, orange, lemon] lemon was placed with index 4

        System.out.println("index of first lemon: " + fruits.indexOf("lemon")); // index of first lemon: 1
        System.out.println("index of last lemon: " + fruits.lastIndexOf("lemon")); // index of last lemon: 4

        List moreFruit = List.of("cherry", "cranberry", "plum");
        System.out.println(moreFruit); // [cherry, cranberry, plum]

    }
}
