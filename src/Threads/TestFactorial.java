package Threads;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class TestFactorial {
    public static void main(String[] args) {
        // list - {450000, 34000, 23330, 56000, 10000, 45000, 70000, 40000}

        List<Integer> numbers = Arrays.asList(40000, 823233, 60000);

        long start = System.currentTimeMillis();
          /*numbers.stream()
                .map(TestFactorial::getFactorial)
                .forEach(System.out::println);*/
        for (int i = 0; i < numbers.size(); i++) {
            getFactorial(i);
        }

        System.out.println("time taken - " + (System.currentTimeMillis() - start));

    }

    public static BigInteger getFactorial(int num) {
        System.out.println("I am Hero");
       /* BigInteger result = BigInteger.ONE;

        for(int i=2; i<=num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;*/
        return null;
    }

}
