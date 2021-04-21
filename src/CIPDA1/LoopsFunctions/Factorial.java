package CIPDA1.LoopsFunctions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int ans = 1;
        while (m != 0) {
            ans = ans * m;
            m--;
        }

        System.out.println(ans);
    }
}
