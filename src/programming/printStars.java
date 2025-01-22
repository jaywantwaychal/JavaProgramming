package programming;

public class printStars {

    public static void main(String[] args) {

        new printStars().printTriangle(15);
    }

    private void printTriangle(int numberOfRows) {

        //type 1
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //type 2
        for (int i = 1; i <= numberOfRows; i++) {
            int k = 0;
            while ((i + k) < numberOfRows) {
                System.out.print(" ");
                k++;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

