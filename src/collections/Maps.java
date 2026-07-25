package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {

        // fruits will be added in uncontrolled order: {banana=105, orange=45, apple=95, lemon=20}
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        System.out.println(fruitCalories);

        //fruitCalories.put("lemon", 17); // overrides existing value
        //System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=17} lemon=17 instead lemon=20

        fruitCalories.putIfAbsent("lemon", 17);
        System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=20} lemon=20 is not removed by lemon=17

        System.out.println("banana: " + fruitCalories.get("banana")); // banana: 105

    }
}
