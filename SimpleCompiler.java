package day2;

import java.util.Scanner;
public class SimpleCompiler {
public static void main (String[] args) {
	
	Scanner Sc = new Scanner(System.in);
	System.out.println("Add = 0");
	System.out.println("Sub = 1");
	System.out.println("Mul = 2");
	System.out.println("Div = 3");
	System.out.println("Mod = 4");
	System.out.println("Enter your choice: ");
	
	int key=Sc.nextInt();
	System.out.println("enter first num: ");
	int fnum=Sc.nextInt();
	System.out.println("enter second num: ");
	int snum=Sc.nextInt();
	
	/*if(key==0) {
		int ans=fnum+snum;
		System.out.println("Answer: " +ans);	
	}
	else if(key==1){
		int ans=fnum-snum;
		System.out.println("Answer: " +ans);	
	}
	else if(key==2){
		int ans=fnum*snum;
		System.out.println("Answer: " +ans);	
	}
	else if(key==3){
		int ans=fnum/snum;
		System.out.println("Answer: " +ans);	
	}
	else if(key==4){
		int ans=fnum%snum;
		System.out.println("Answer: " +ans);	
	}
	else {
		System.out.println("Enter correct choice");
	}*/
	
	switch(key) {
		case 0:{
			int ans=fnum+snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 1:{
			int ans=fnum-snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 2:{
			long ans= (long)fnum*snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 3:{
			int ans=fnum/snum;
			System.out.println("Answer: " +ans);
			break;
		}
		case 4:{
			int ans=fnum%snum;
			System.out.println("Answer: " +ans);
			break;
		}
		default:{
			System.out.println("Enter correct choice");
		}
	
	}
}

}
