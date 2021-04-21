package CIPDA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
    public static void main(String[] args) throws IOException {

        //Enter data using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading the data using readLine
        String name = reader.readLine();
        // Printing the read line
        System.out.println("You entered: " + name);

        int age = Integer.parseInt(reader.readLine());
        System.out.println("You entered: " + age);
    }
}
