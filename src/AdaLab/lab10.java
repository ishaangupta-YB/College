package AdaLab;

import java.util.*;

public class lab10 {
      static int getMax(int arr[], int n) {
            int mx = arr[0];
            for (int i = 1; i < n; i++)
                  if (arr[i] > mx)
                        mx = arr[i];
            return mx;
      }

      static void countSort(int arr[], int n, int exp) {
            int output[] = new int[n];
            int i;
            int count[] = new int[10];
            Arrays.fill(count, 0);
            for (i = 0; i < n; i++)
                  count[(arr[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                  count[i] += count[i - 1];
            for (i = n - 1; i >= 0; i--) {
                  output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                  count[(arr[i] / exp) % 10]--;
            }
            for (i = 0; i < n; i++)
                  arr[i] = output[i];
      }

      static void radixsort(int arr[], int n) {
            int m = getMax(arr, n);
            for (int exp = 1; m / exp > 0; exp *= 10)
                  countSort(arr, n, exp);
      }

      static void shellSort(int a[], int n) {

            for (int j = n/2;j>0;j/=2) {
                  for (int i=j;i<n;i+=1) {
                        int tmp = a[i];
                        int k=0;
                        for (k=i; k>=j && a[k-j]>tmp;k-=j)
                              a[k]=a[k-j];
                        a[k]=tmp;
                  }
            }
      }

      static int[] bucketSort(int[] sequence, int maxValue) {
            int[] Bucket = new int[maxValue + 1];
            int[] sorted_sequence = new int[sequence.length];
            for (int i = 0; i < sequence.length; i++)
                  Bucket[sequence[i]]++;
            int outPos = 0;
            for (int i = 0; i < Bucket.length; i++)
                  for (int j = 0; j < Bucket[i]; j++)
                        sorted_sequence[outPos++] = i;
            return sorted_sequence;
      }

      static int maxValue(int[] sequence) {
            int maxValue = 0;
            for (int i = 0; i < sequence.length; i++)
                  if (sequence[i] > maxValue)
                        maxValue = sequence[i];
            return maxValue;
      }

      static void print(int arr[], int n) {
            for (int i = 0; i < n; i++)
                  System.out.print(arr[i] + " ");
            System.out.println();
      }

      static void printSequence(int[] sorted_sequence) {
            for (int i = 0; i < sorted_sequence.length; i++)
                  System.out.print(sorted_sequence[i] + " ");
      }

      public static void main(String[] args) {
            int arr[] = {2, 3, 1, 0, 9};
            int n = arr.length;
            System.out.println("Array before sorting");
            print(arr, n);
            radixsort(arr, n);
            System.out.println("Array after sorting using Radix Sort");
            print(arr, n);

            int a[] = {2, 3, 1, 0, 9};
            n = a.length;
            System.out.println("Array before sorting");
            print(a, n);
            System.out.println("Array after sorting using Shell Sort");
            shellSort(a, n);
            print(arr,n);

            Random random = new Random();
            int N = 20;
            int[] sequence = new int[N];
            for (int i = 0; i < N; i++)
                  sequence[i] = Math.abs(random.nextInt(100));
            int maxValue = maxValue(sequence);
            System.out.println("\nOriginal Sequence: ");
            printSequence(sequence);
            System.out.println("\nArray after sorting using Bucket Sort ");
            printSequence(bucketSort(sequence, maxValue));
      }
}
