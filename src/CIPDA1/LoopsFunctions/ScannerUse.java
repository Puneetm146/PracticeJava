package CIPDA1.LoopsFunctions;// Java program to demonstrate working of Scanner in Java

import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        // using scanner for getting Input from user
        Scanner in = new Scanner(System.in);
        boolean c = true;

        FirstJavaClass obj1 = new FirstJavaClass();
        obj1.englishMarks = 100;

        System.out.println(obj1.englishMarks);
        System.out.println(FirstJavaClass.name);
        System.out.println("C:\\xyz\\abc.txt");
        String s = in.nextLine();
        System.out.println("Your entered string: " + s);

        int a = in.nextInt();
        System.out.println("You entered integer: " + a);

        float b = in.nextFloat();
        System.out.println("You entered float: " + b);
        in.nextLine();
        String str = in.nextLine();
        System.out.println("You entered string: " + str);

    }
}
