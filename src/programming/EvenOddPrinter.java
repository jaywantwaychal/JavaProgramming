package programming;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinter {

    private static  Object object = new Object();
    private static IntPredicate evenPredicate = e -> e % 2 == 0;
    private static IntPredicate oddPredicate = e -> e % 2 == 1;

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync(() -> EvenOddPrinter.printNumber(evenPredicate));
        CompletableFuture.runAsync(() -> EvenOddPrinter.printNumber(oddPredicate));
        Thread.sleep(1000);
    }

    private static void printNumber(IntPredicate predicate) {
        IntStream.rangeClosed(1, 10).filter(predicate).forEach(EvenOddPrinter::execute);
    }

    private static void execute(int i) {

        synchronized(object) {

            try {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
