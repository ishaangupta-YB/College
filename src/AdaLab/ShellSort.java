package AdaLab;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
 
	void shellSort(int a[], int n) {
		
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
 
	public static void main(String args[]) {
		ShellSort s = new ShellSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		
		s.shellSort(a, a.length);
		
		
		System.out.println("Sorted Array"+Arrays.toString(a)); 
	}
}