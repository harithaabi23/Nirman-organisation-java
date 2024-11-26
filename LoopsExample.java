package day3;
import java.util.Scanner;
public class LoopsExample {
public static void main (String[] args) {
	Scanner Sc= new Scanner(System.in);
	System.out.println("Enter number: ");
	int num= Sc.nextInt();
	System.out.println("Enter value : ");
	int val= Sc.nextInt();
	for(int i=val; i>=1; i--) {
		System.out.println(+num + " * "+i +" = " +num*i);
	}
	
}	
}
