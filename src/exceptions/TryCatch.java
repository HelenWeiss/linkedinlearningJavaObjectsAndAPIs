package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {

        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile(); // Unhandled exception: java.io.IOException
        } catch (IOException e) {
            // Sorry, an error has occurred: Системе не удается найти указанный путь
            System.out.println("Sorry, an error has occurred: " + e.getMessage()); // why did exception was thrown
            // at exceptions.TryCatch.main(TryCatch.java:12)
            e.printStackTrace();
        }
    }
}
