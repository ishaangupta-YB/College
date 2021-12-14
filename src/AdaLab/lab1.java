package AdaLab;
import java.util.Arrays;
import java.util.Scanner;
public class lab1 {
	static void linear_search(int[] a,int x) {
		System.out.println("Using linear search in array "+Arrays.toString(a)); for(int i=0;i<a.length;i++) {
			if(a[i] == x) {
				System.out.println("Element found at index "+i);
				return;
			}
		}
		System.out.println("Element not present\n\n");
	}
	static void binary_search(int arr[],int x) {
		Arrays.sort(arr);
		System.out.println("Using Binary search in array (sorted) " +
			Arrays.toString(arr));
		int f=0,r=arr.length-1;
		while (f <= r) {
			int m = f+(r-f)/2;
			if (arr[m]==x){
				System.out.println("Element present at index = "+m);
				return;
			}
			if (arr[m]<x) f=m+1;
			else r=m-1;
		}
		System.out.println("Element not present");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		System.out.println("Enter element to be searched ");
		int x= sc.nextInt();
		linear_search(a,x);
		binary_search(a,x);
	}
}