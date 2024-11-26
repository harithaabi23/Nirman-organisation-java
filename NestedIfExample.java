package day3;

import java.util.Scanner;
public class NestedIfExample {
	public static void main (String[] args) {
	Scanner Sc= new Scanner(System.in);
	System.out.println("Enter your mark: ");
	int mark= Sc.nextInt();
	
	if (mark>=35 && mark<=100){ {
		System.out.println("Pass");
		System.out.println("Your mark is " +mark);
	}
		if(mark>=90) {
			System.out.println("Grade A");
		} 
		else if (mark>=70) {
			System.out.println("Grade B");
		}
		else if (mark>=50) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}
	
	else if (mark<=34 && mark >= 0){
		System.out.println("Fail");
		}
	else {
		System.out.println("enter correct number");
	}
	
	}
	}
