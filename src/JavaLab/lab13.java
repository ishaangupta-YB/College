package JavaLab;


class thread1 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Running thread "+t.getName());
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		System.out.println(t.getName()+" says I slept well!");
	}
}

class thread2 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Running thread "+t.getName()); 
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		System.out.println(t.getName()+" says had a great sleep!");
	} 
}

public class lab13 {

	public static void main(String[] args) { 
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		
		t1.start();
		t2.start();
		
		System.out.println();
	}
}
