package functionalprogrammimg;

import java.util.List;
import java.util.stream.Collectors;

public class Colors {

    public static void main(String[] args) {

        /*************************************************************
         This is how your code will be called.
         Your answer should be a filtered list containing colors with
         the letter 'e'.
         You can edit this code to try different testing cases.
         *************************************************************/
        List<String> colors = List.of("red", "green", "blue", "pink", "black", "brown", "yellow", "purple", "orange", "white");
        List<String> result = Colors.filterColorsContainingE(colors);

    }

    static List<String> filterColorsContainingE(List<String> colors) {

        //TODO: Use stream operations to filter the list of colors
        //into a new list that contains only the ones that contain the letter 'e'.

        List colorsThatContainsWithE = colors.stream().filter(c -> c.contains("e"))
                                                      .collect(Collectors.toList());
        colorsThatContainsWithE.forEach(System.out::println);
        return colorsThatContainsWithE;
    }
}
