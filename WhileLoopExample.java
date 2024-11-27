package day4;

import java.util.Scanner;
public class WhileLoopExample {
public static void main (String[] args) {
	
	Scanner Sc = new Scanner(System.in);
		
	boolean isTrue=true;
	
	while(isTrue) {
		System.out.println("Add = 0");
		System.out.println("Sub = 1");
		System.out.println("Mul = 2");
		System.out.println("Div = 3");
		System.out.println("Mod = 4");
		System.out.println("Exit = 5");
		System.out.println("Enter your choice: ");
		int key=Sc.nextInt();
	switch(key) {
	
		case 0:{
			System.out.println("enter first num: ");
			int fnum=Sc.nextInt();
			System.out.println("enter second num: ");
			int snum=Sc.nextInt();
			int ans=fnum+snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 1:{
			System.out.println("enter first num: ");
			int fnum=Sc.nextInt();
			System.out.println("enter second num: ");
			int snum=Sc.nextInt();
			int ans=fnum-snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 2:{
			System.out.println("enter first num: ");
			int fnum=Sc.nextInt();
			System.out.println("enter second num: ");
			int snum=Sc.nextInt();
			long ans= (long)fnum*snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 3:{
			System.out.println("enter first num: ");
			int fnum=Sc.nextInt();
			System.out.println("enter second num: ");
			int snum=Sc.nextInt();
			int ans=fnum/snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 4:{
			System.out.println("enter first num: ");
			int fnum=Sc.nextInt();
			System.out.println("enter second num: ");
			int snum=Sc.nextInt();
			int ans=fnum%snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 5:{
			isTrue = false;
			System.out.println("thank you");
			break;
		}
		default:{
			isTrue = false;
			System.out.println("Enter correct choice");
			break;
		}
	
	}}
}

}