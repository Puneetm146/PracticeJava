package CIPDA1.LoopsFunctions;

public class autoBoxing {
    public static void main(String[] args) {
        int x1 = 10;
        Integer x2 = x1;    // AutoBoxing
        int x3 = x2;        // Auto-Unboxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        Integer x4 = 400, x5 = 400;
        if (x4 == x5) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");     // Result will be not same becoz both are different objects
        }

        int y1 = 3, y2 = 6;
        System.out.println(~y1);

        int z = -1;
        System.out.println(z << 1);

    }
}
