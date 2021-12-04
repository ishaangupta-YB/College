package JavaLab;

import java.util.Scanner;

public class lab6 { 

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		try {
			if(n < 10 && n > 5) throw new Exception("Out Of Bound");
			else System.out.println(n*n);
		}catch(Exception e) {
			System.out.println(e.getMessage().toString());
		} 
	}
}
