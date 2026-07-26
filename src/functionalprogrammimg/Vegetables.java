package functionalprogrammimg;

import java.util.List;
import java.util.stream.Collectors;

public class Vegetables {

    public static void main(String[] args) {

        List<String> veggies = List.of(
                "spinach",
                "cabbage",
                "peas",
                "green beans",
                "brussels sprouts",
                "carrots");

        // call the method filterVegetablesContainingS
        List<String> result = Vegetables.filterVegetablesContainingS(veggies);

        // manipulating of veggies
        veggies.stream().anyMatch(v -> v.contains(" ")); // true, "green beans" & "brussels sprouts"
        veggies.stream().allMatch(v -> v.contains("s")); // false, cabbage doesn't contain "s"
        veggies.stream().filter(v -> v.startsWith("c")).forEach(System.out::println); // cabbage, carrots
        veggies.stream().map(String::toUpperCase).forEach(System.out::println); // all vegetables with upper case
        veggies.stream().sorted().reduce("", (a,b) -> a + "|" +b); // spinach|cabbage|peas|green beans|brussels sprouts|carrots

        List veggiesThatEndWithS = veggies.stream().filter(v -> v.endsWith("s")).collect(Collectors.toList());
        veggiesThatEndWithS.forEach(System.out::println); // peas, green beans, brussels sprouts, carrots

        veggies.stream()
                .sorted()
                .filter(v -> v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v -> v.transform(w -> "yummy " + w))
                .collect(Collectors.toList())
                .forEach(System.out::println); // yummy CABBAGE, yummy CARROTS
    }

    static List<String> filterVegetablesContainingS(List<String> veggies) {

        List veggiesThatContainsS = veggies.stream().filter(v -> v.contains("s"))
                                                    .collect(Collectors.toList());;

        veggiesThatContainsS.forEach(System.out::println);
        return veggiesThatContainsS;
    }
}
