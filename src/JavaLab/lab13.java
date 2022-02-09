package JavaLab;


class thread1 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Running thread - "+t.getName());
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		System.out.println("Normal thread is now awake");
	}
}


public class lab13 {

	public static void main(String[] args) { 
		thread1 t1 = new thread1();
		
		t1.start();
		try{
			System.out.println("User thread is sleeping");
			Thread.sleep(1000);
		}catch (Exception e){
			System.out.println(e.getLocalizedMessage());
		}

		System.out.println("User thread is now awake");
	}
}
