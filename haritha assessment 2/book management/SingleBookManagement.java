
package day12;
import java.util.Scanner;

public class SingleBookManagement {
	public static void main(String[] args) {
		
		Book series = new Book("The Silent Patient","Alex Michaelides",300,2);
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		int choice;
		while(isTrue) {
			System.out.println("Select an option:");
			System.out.println("1. Add/Update Book Details");
			System.out.println("2. Show Book Details");
			System.out.println("0. Exit");
			System.out.println();
			
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter Book Title: ");
				String title = sc.nextLine();
				System.out.println("Enter Book Author:");
				String author= sc.nextLine();
				System.out.println("Enter Price:");
				double price=sc.nextDouble();
				System.out.println("Enetr Number of Copies:");
				int noOfCopies = sc.nextInt();		
				
				series.setTitle(title);
				series.setAuthor(author);
				series.setPrice(price);
				series.setNumberOfCopies(noOfCopies);
				System.out.println("Your Details Updated Succssfully.");
				System.out.println();	
				break;
				
			}
			case 2:{
				System.out.println("Book Details: ");
				System.out.println(series.toString());
				break;
			}
			case 0:{
				System.out.println("Program Exit.");
				isTrue=false;
				break;		
			}
			default:{
				System.out.println("Enter correct choice.");
			}
			}
			
		}
		
	}
	
}
