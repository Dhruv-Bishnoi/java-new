package function;

import java.util.*;

public class matriX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = 4;
        int col = 5;

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter a number for " + i + "," + j);

                arr[i][j] = sc.nextInt();

            }

        }

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        int x = 10;
        int found = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (arr[i][j] == x) {
                    System.out.println("found element" + x);
                    found = 1;

                }
            }
        }
        if (found == 0) {
            System.out.println("element not found");
            System.out.println();
        }

        sc.close();

    }

}
