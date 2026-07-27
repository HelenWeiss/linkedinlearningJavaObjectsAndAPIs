package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {

        File fileNumbers = new File("src/numbers.txt");
        Scanner fileReader = null;

        try{
            fileReader = new Scanner(fileNumbers); // Unhandled exception: java.io.FileNotFoundException

            while(fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }


        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();


        } finally {
            fileReader.close(); // finally block will be executed in any case: an exception was thrown or wasn't
        }
    }
}
