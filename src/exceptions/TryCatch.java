package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        // 1. catch one exception
/*
        File file = new File("resources/nonexistent.txt");

        try{
            file.createNewFile(); // Unhandled exception: java.io.IOException
        } catch (IOException e) {
            // Sorry, an error has occurred: Системе не удается найти указанный путь
            System.out.println("Sorry, an error has occurred: " + e.getMessage()); // why did exception was thrown
            // at exceptions.TryCatch.main(TryCatch.java:12)
            e.printStackTrace();
        }
*/
        // handle multiple exceptions:
        // series of catch blocks and multiple catch block
        File fileNumbers = new File("src/numbers.txt");
        System.out.println(fileNumbers.getAbsolutePath());
        try{
            Scanner fileReader = new Scanner(fileNumbers); // Unhandled exception: java.io.FileNotFoundException
            while(fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
       }
        // 2. series of catch blocks
        // instead of series of catch blocks are represented multiple catch block in lines 42-44
/*      catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
*/
        // 3. multiple catch block
        catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();  // at exceptions.TryCatch.main(TryCatch.java:33)
        }

    }
}
