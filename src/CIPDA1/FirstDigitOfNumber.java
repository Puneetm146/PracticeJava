package CIPDA1;

import java.util.Scanner;

public class FirstDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int result = 0;

        while (input != 0) {

            result = input;
            input = input / 10;

        }
        System.out.println(result);
    }
}
