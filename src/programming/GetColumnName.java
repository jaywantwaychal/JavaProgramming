package programming;

import java.util.Scanner;

public class GetColumnName {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Column Number: ");
            int columnNumber = scanner.nextInt();
            System.out.println();
            String columnName = new GetColumnName().getColumnNameFor(columnNumber);
            System.out.println("Column Name for : " + columnName);
        }
    }

    private String getColumnNameFor(int columnNumber) {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder columnName = new StringBuilder();
        if (columnNumber <= 26) {
            return "" + letters.charAt(columnNumber - 1);
        }
        int i = columnNumber/26;
        int j = columnNumber%26;

        System.out.println(i);
        System.out.println(j);

        if(i<=26) {
            columnName.append(letters.charAt(i - 1));
            System.out.println(letters.charAt(i - 1));
        }else{
            int x = i/26;
            int k = i%26;
            System.out.println(x);
            System.out.println(k);
        }
        if(j<=26) {
            columnName.append(letters.charAt(j - 1));
            System.out.println(letters.charAt(j - 1));
        }
       /* while (columnNumber >= 26) {
            int i = columnNumber/26;
            int j = columnNumber%26;
            columnNumber = columnNumber - 26;
            columnName.append(letters.charAt(columnNumber - 1));

        }*/
        return columnName.toString();
    }

}
