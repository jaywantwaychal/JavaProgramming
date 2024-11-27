
import java.util.Scanner;

//Fibonacci Series and Nth fibonacci number calculation
public class java8Practice {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int next ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenth for Fibonacci series: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.print(first);
            if (i != length - 1) {
                System.out.print(", ");
            }
            next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        System.out.println("Get Nth Fibonacci number: ");
        int nth = scanner.nextInt();
        first = 0;
        second = 1;
        next = 0;

        if (nth == 1) {
            System.out.println(first);
        } else if (nth == 2) {
            System.out.println(second);
        } else {
            for (int i = 3; i <= nth; i++) {
                next = first + second;
                first = second;
                second = next;
                System.out.print(next + ", ");
            }
            System.out.println("Nth Fibonacci number is :" + next);
        }

    }
}
