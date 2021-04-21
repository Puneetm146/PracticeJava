package Threads;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + " " + (5 * 5));

        MyThread[] thread = new MyThread[6];

        Arrays.stream(thread).forEach(x -> {
            //  MyThread2 thread1 = new MyThread2();
            Thread thread1 = new Thread(new MyThread2());
            thread1.run();
        });

        //  System.out.println("In main function "+ thread);

    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am in Thread - " + currentThread());
            System.out.println(5 * 7);
        }
    }

    private static class MyThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("I am in Thread - " + Thread.currentThread());
            System.out.println(5 * 9);
        }
    }

}
