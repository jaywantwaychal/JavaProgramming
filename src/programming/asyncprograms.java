package programming;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class asyncprograms {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int no = 12;
        Thread t = new Thread(() ->
            System.out.println("squareroot of Number: "+ no + "is "+ Math.sqrt(no)));
        t.start();
         int no2 = 144;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Double> future = executorService.submit(() -> Math.sqrt(no2));
        while(!future.isDone()) {
            System.out.println("squareroot of Number: pending" );
        }
        System.out.println("squareroot of Number: "+ no2 + "is "+ future.get());
        executorService.shutdown();
    }

}
