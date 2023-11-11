package programming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixSum {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> m1 = new ArrayList<>();
        m1.add(2);
        m1.add(21);
        m1.add(22);
        m1.add(33);
        List<Integer> m2 = new ArrayList<>();
        m2.add(22);
        m2.add(2);
        m2.add(12);
        m2.add(11);
        List<Integer> m3 = new ArrayList<>();
        m3.add(34);
        m3.add(45);
        m3.add(55);
        m3.add(33);
        List<Integer> m4 = new ArrayList<>();
        m4.add(11);
        m4.add(22);
        m4.add(12);
        m4.add(11);
        matrix.add(m1);
        matrix.add(m2);
        matrix.add(m3);
        matrix.add(m4);
        List<Integer> intlist = matrix.stream()
            .flatMap(li -> li.stream().map(in -> in.intValue()))
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
        int size = matrix.size();
        int sum = 0;
        for(int i = 0; i<size/2;i++) {
            sum = sum + intlist.get(i);
        }
        System.out.println(sum);
       /* int size = matrix.size();
        System.out.println(matrix);
        List<List<Integer>> revSorted = new ArrayList<>();

        revSorted = matrix.stream().map(unstd ->
            unstd.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList())
        ).collect(Collectors.toList());

        System.out.println(revSorted);
        int quadL = size/2;

        Integer[][] mat = new Integer[size][size];
        System.out.println(size);
        for (int i=0; i< size; i++) {
            for(int j=0;j<size;j++) {
                mat[i][j] = (revSorted.get(i)).get(j);
            }
        }

        printMethod(size, mat);
        List<List<Integer>> qCols = new ArrayList<>();

        for(int i = 0; i < size ; i++) {
            List<Integer> q = new ArrayList<>();
            for(int j = 0;j <size; j++) {
                q.add(mat[i][j]);
            }
            qCols.add(q);
        }
        System.out.println("========");
        printMethod(size, mat);

        System.out.println("========");
        List<List<Integer>> revSorted2;

        revSorted2 = qCols.stream().map(unstd ->
            unstd.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList())
        ).collect(Collectors.toList());
        for (int i=0; i< size; i++) {
            for(int j=0;j<size;j++) {
                mat[i][j] = (revSorted2.get(i)).get(j);
            }
        }
        printMethod(size, mat);
       // printMethod(size, mat);
        /*int c3 = size/2;
        List<Integer> c2 = new ArrayList<>();

        for(int j = 0; j< size;j++) {
            c2.add(mat[j][c3]);
        }

        for(int i = 0, k = size-1; i < size && k >=0; i++, k--){
            mat[i][c3] = c2.get(k);
        }
        System.out.println("========");
        printMethod(size, mat);
        System.out.println("========");
        int x = 0;
        int t ;
       while(x < size) {
           t = mat[0][x];
           mat[0][x] = mat[c3][x];
           mat[c3][x] = t;
           x++;
       }
        printMethod(size, mat);
        System.out.println("========");

        int sum = 0;
        for(int i = 0; i < c3; i++) {
            for(int j =0 ; j < c3;j++) {
                sum = sum + mat[i][j];
            }
        }
        System.out.println(sum);*/

    }

    private static void printMethod(int size, Integer[][] mat) {
        for (int i = 0; i< size; i++) {
            for(int j = 0; j< size; j++) {
                System.out.print(" "+ mat[i][j] );
            }
            System.out.println();
        }
    }
}
