package day25;

class animal {
	
}

class Ex1 extends animal implements Runnable{
	public void run() {
	for (int i=1; i<=50;i++) {
		System.out.println("Example 1: "+i);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}}

 class Ex2 extends animal implements Runnable{
	 public void run() {
	for (int i=1; i<=50;i++) {
		System.out.println("Example 2: "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}}

public class ThreadsImplements {

	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		Ex2 ex2 = new Ex2();
		
		Thread t1= new Thread(ex1);
		Thread t2= new Thread(ex2);
		t1.start();
		t2.start();
		
	}
}
