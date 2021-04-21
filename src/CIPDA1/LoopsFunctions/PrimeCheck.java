package CIPDA1.LoopsFunctions;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0 || input == 1)
            System.out.println("Neither prime nor composite");

        int i = 2;
        int flag = 0;
        while (i < input) {
            if (input % i == 0) {
                System.out.println("No");
                flag = 1;
            }
            i++;
        }

        if (flag == 0) {
            System.out.println("Yes");
        }

    }
}
