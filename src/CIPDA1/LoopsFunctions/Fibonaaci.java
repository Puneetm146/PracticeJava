package CIPDA1.LoopsFunctions;

import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < input; i++) {
            c = a + b;

            a = b;
            b = c;
        }
        System.out.print(c + " ");

    }
}
