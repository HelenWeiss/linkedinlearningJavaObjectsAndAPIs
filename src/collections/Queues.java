package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        // fruits will be added in right order: [apple, lemon, banana, orange]
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits); // [apple, lemon, banana, orange]

        fruits.add("lemon");
        System.out.println(fruits); // [apple, lemon, banana, orange, lemon]

        var removed = fruits.remove(); // removes the first item with index 0 (apple)
        System.out.println(fruits); // [lemon, banana, orange, lemon]
        System.out.println("removed: " + removed); // removed: apple

        System.out.println("head of queue: " + fruits.peek()); // head of queue: lemon

    }
}
