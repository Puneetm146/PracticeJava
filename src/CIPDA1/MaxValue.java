package CIPDA1;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        int ans = Math.max(a, b);
        ans = Math.max(ans, c);
        System.out.println("MAX Value: " + ans);

    }
}
