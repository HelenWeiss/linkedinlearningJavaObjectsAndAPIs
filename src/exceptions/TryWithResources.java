package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        File inputFile = new File("src/numbers.txt");
        File outputFile = new File("src/output.txt");

        try(Scanner fileReader = new Scanner(inputFile);
            PrintWriter fileWriter = new PrintWriter(outputFile);) {

            while(fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble()); // at exceptions.TryWithResources.main(TryWithResources.java:20)
            }

        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();

        }
    }
}
