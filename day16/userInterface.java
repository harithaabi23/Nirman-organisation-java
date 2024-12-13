package day16;

import java.util.Scanner;

public class userInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator cal = new Calculator();
		
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("Choose an option");
			System.out.println("1 for Addition");
			System.out.println("2 for subraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			System.out.println("0 to Exit");
			
			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice==1) {
				System.out.println("enter a value: ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("enter b value: ");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println(cal.add(a, b));
			}
			
			else if(choice==2) {
				System.out.println("enter a value: ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("enter b value: ");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println(cal.sub(a, b));
			}
			
			else if(choice==3) {
				System.out.println("enter a value: ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("enter b value: ");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println(cal.mul(a, b));
			}
			
			else if(choice==4) {
				System.out.println("enter a value: ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("enter b value: ");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println(cal.div(a, b));
			}
			
			else if(choice ==0) {
				isTrue = false;
				System.out.println("thank you");
			}
			
			else {
				System.out.println("Enter correct option");
			}
		
		}
		
		
	}
}
