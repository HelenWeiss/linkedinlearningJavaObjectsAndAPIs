package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RethrowingExceptions {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        rethrowException(); // error "Unhandled exception: java.io.IOException" after adding "throws IOException" for the method main, row 10
    }

    public static void rethrowException() throws IOException, FileNotFoundException {
        File file = new File("nonexistent/file.txt");
        file.createNewFile(); // error "Unhandled exception: java.io.IOException" without "throws IOException" for the method, row 12

        Scanner fileReader = new Scanner(file);
    }
}
