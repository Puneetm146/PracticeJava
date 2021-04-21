package CIPDA1;

import java.util.Scanner;

public class ConditionJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            if (n % 3 == 0) {
                if (n % 11 == 0) {
                    System.out.print("Eleven");
                } else {
                    System.out.print("Three");
                }
            } else {
                System.out.print("Two");
            }
        } else if (n % 3 == 0) {
            if (n % 11 == 0) {
                System.out.print("Eleven");
            } else {
                System.out.print("Three");
            }
        } else if (n % 11 == 0) {
            System.out.print("Eleven");
        } else {
            System.out.print("-1");
        }
    }
}
