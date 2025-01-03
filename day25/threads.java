package day25;

	class Example1 extends Thread{
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

	 class Example2 extends Thread{
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

public class threads {
	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		Example2 ex2 = new Example2();
		
		ex1.start();
		ex2.start();
		
	}
}
