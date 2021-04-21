package Threads;

import java.math.BigInteger;

public class MyThreadOuter extends Thread {

    int num;

    MyThreadOuter(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        getFatorial(this.num);
    }

    public BigInteger getFatorial(int num) {
        System.out.println(currentThread().getName());
//       BigInteger result = BigInteger.ONE;
//
//        for(int i=2; i<=num; i++){
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//        return result;

        return null;
    }
}
