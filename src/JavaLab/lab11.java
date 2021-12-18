package JavaLab;

public class lab11 {

	public static void main(String[] args) {
		Thread t = new Thread("ishaan");
		t.start();
		System.out.println(t.getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		t.setName("gupta");
		System.out.println(t.getName());
	}
}