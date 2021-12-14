package AdaLab;
import java.util.Arrays;
import java.util.Scanner;
public class lab2 {
      static void bubbleSort(int a[]) {
            int n = a.length;
            for (int i = 0; i < n-1; i++)
                  for (int j = 0; j < n-i-1; j++)
                        if (a[j] > a[j+1]) {
                              a[j] = a[j] + a[j+1];
                              a[j+1] = a[j] - a[j+1];
                              a[j] = a[j] - a[j+1];
                        }
            System.out.println("Sorted array is "+Arrays.toString(a));
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter array elements ");
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            bubbleSort(a);
      }
}