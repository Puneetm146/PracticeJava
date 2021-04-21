package CIPDA1.LoopsFunctions;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i == 1 || i == input) {
                for (int j = 1; j <= input; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= input; j++) {
                    if (j == 1 || j == input) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
