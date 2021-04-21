package Threads;

import java.util.Arrays;
import java.util.List;

public class FactorialMT {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(40000, 823233, 60000);

        MyThreadOuter[] threads = new MyThreadOuter[numbers.size()];

        /*IntStream.range(0,numbers.size()).forEach(i->{
            threads[i] = new MyThreadOuter(numbers.get(i));
            threads[i].start();
        });*/
        long start = System.currentTimeMillis();

        for (int i = 0; i < numbers.size(); i++) {
            threads[i] = new MyThreadOuter(numbers.get(i));
            threads[i].start();
        }

        for (int i = 0; i < numbers.size(); i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("time taken " + (System.currentTimeMillis() - start));

    }

}
