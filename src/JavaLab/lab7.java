package JavaLab;

public class lab7 {

	public static void main(String[] args) {
		int n = args.length;
		try {
			if(n == 0) throw new Exception("First and Second number not entered");
			else if(n == 1) throw new Exception("Second number not entered"); 
			else {
				try {
					int x = Integer.parseInt(args[0]);
					int y = Integer.parseInt(args[1]);
					
					try {
						System.out.println(x/y);
					}catch(ArithmeticException e) {
						System.out.println(e.getMessage().toString());
					}
				}catch(NumberFormatException e) {
					System.out.println("Exception - "+e.getMessage().toString());
				}	
			}
		}catch(Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}
}
