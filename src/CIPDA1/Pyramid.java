package CIPDA1;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int i = 1;
        while (i <= m) {
            int j = 1;
            while (j <= m - i) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= ((2 * i) - 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
