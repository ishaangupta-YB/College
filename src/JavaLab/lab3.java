package JavaLab;

import java.util.Scanner;

public class lab3 {
	static void multiply(int a[][], int b[][]) {
		int n = a.length;
		int res[][] = new int[3][3];

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				res[i][j] = 0;
				for(int k=0;k<3;k++) res[i][j] = a[i][k] + b[k][j];
			}
		}
		System.out.println("Result");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) System.out.print(res[i][j]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		
		System.out.println("Enter elements in 1st matrix");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) a[i][j] = sc.nextInt();
		
		System.out.println("Enter elements in 2nd matrix");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) b[i][j] = sc.nextInt();
		
		multiply(a,b);
	}
}
