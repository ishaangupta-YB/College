package AdaLab;

import java.util.Arrays;
import java.util.Scanner;

public class lab3 {
      static Scanner sc = new Scanner(System.in);

      static int[][] multiply(int[][] a, int[][] b) {
            int n = a.length;
            int[][] c = new int[n][n];
            if (n == 1)
                  c[0][0] = a[0][0] * b[0][0];
            else {
                  int[][] A11 = new int[n / 2][n / 2];
                  int[][] A12 = new int[n / 2][n / 2];
                  int[][] A21 = new int[n / 2][n / 2];
                  int[][] A22 = new int[n / 2][n / 2];
                  int[][] B11 = new int[n / 2][n / 2];
                  int[][] B12 = new int[n / 2][n / 2];
                  int[][] B21 = new int[n / 2][n / 2];
                  int[][] B22 = new int[n / 2][n / 2];
                  // divide matrix A into 4 halves
                  split(a, A11, 0, 0);
                  split(a, A12, 0, n / 2);
                  split(a, A21, n / 2, 0);
                  split(a, A22, n / 2, n / 2);
                  // divide matrix B into 4 halvess
                  split(b, B11, 0, 0);
                  split(b, B12, 0, n / 2);
                  split(b, B21, n / 2, 0);
                  split(b, B22, n / 2, n / 2);

                  int[][] p1 = multiply(add(A11, A22), add(B11, B22));
                  int[][] p2 = multiply(add(A21, A22), B11);
                  int[][] p3 = multiply(A11, sub(B12, B22));
                  int[][] p4 = multiply(A22, sub(B21, B11));
                  int[][] p5 = multiply(add(A11, A12), B22);
                  int[][] p6 = multiply(sub(A21, A11), add(B11, B12));
                  int[][] p7 = multiply(sub(A12, A22), add(B21, B22));

                  int[][] C11 = add(sub(add(p1, p4), p5), p7);
                  int[][] C12 = add(p3, p5);
                  int[][] C21 = add(p2, p4);
                  int[][] C22 = add(sub(add(p1, p3), p2), p6);
                  // join 4 halves into one result matrix
                  join(C11, c, 0, 0);
                  join(C12, c, 0, n / 2);
                  join(C21, c, n / 2, 0);
                  join(C22, c, n / 2, n / 2);
            }
            return c;
      }

      static int[][] add(int[][] a, int[][] b) {
            int n = a.length;
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++)
                  for (int j = 0; j < n; j++)
                        c[i][j] = a[i][j] + b[i][j];
            return c;
      }

      static int[][] sub(int[][] a, int[][] b) {
            int n = a.length;
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++)
                  for (int j = 0; j < n; j++)
                        c[i][j] = a[i][j] - b[i][j];
            return c;
      }

      static void split(int[][] parentMatrix, int[][] childMatrix, int fromIndex, int toIndex) {
            for (int i1 = 0, i2 = fromIndex; i1 < childMatrix.length; i1++, i2++)
                  for (int j1 = 0, j2 = toIndex; j1 < childMatrix.length; j1++, j2++)
                        childMatrix[i1][j1] = parentMatrix[i2][j2];
      }

      static void join(int[][] childMatrix, int[][] parentMatrix, int fromIndex, int toIndex) {
            for (
                    int i1 = 0, i2 = fromIndex;
                    i1 < childMatrix.length; i1++, i2++)
                  for (
                          int j1 = 0, j2 = toIndex;
                          j1 < childMatrix.length; j1++, j2++)
                        parentMatrix[i2][j2] = childMatrix[i1][j1];
      }

      static int[][] readMatrix(int[][] temp) {
            System.out.println("Enter elements in matrix");
            for (int i = 0; i < temp.length; i++)
                  for (int j = 0; j < temp[0].length; j++)
                        temp[i][j] = sc.nextInt();

            return temp;
      }

      public static void main(String[] args) {
            System.out.println("Enter size ");
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];
            int[][] c = new int[n][n];

            a = readMatrix(a);
            b = readMatrix(b);

            c = multiply(a, b);

            System.out.println("Result");
            for (int i = 0; i < n; i++)
                  System.out.println(Arrays.toString(c[i]));
      }
}
