package JavaLab;

public class lab12 {

	public static void main(String[] args) { 
		Thread t = new Thread("ishaan");
		t.start();
		
		for(int i=5;i>=0;i--) {
			try {
				System.out.println(t.getName());
				Thread.sleep(6000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		t.setName("gupta");
		System.out.println(t.getName());
	}
}
