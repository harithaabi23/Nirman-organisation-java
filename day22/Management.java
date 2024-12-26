package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Book book=new Book();
	ArrayList<Book> al=new ArrayList<Book>();
	boolean istrue=true;
	while(istrue) {
		System.out.println("Select an option:");
		System.out.println("1. Add Book Details");
		System.out.println("2. update Book Details");
		System.out.println("3 for remove");
		System.out.println("4 for show");
		System.out.println("0. Exit");
		System.out.println("enter your number");
		int key=sc.nextInt();
		sc.nextLine();
		if(key==1) {
			System.out.println("enter book title");
			String title=sc.nextLine();
			
			System.out.println("author name");
			String author=sc.nextLine();
			System.out.println("enter the price");
			double price=sc.nextDouble();
			System.out.println("no of copies");
			int numberOfCopies=sc.nextInt();
			
			al.add(book=new Book(title, author, price, numberOfCopies));
			
			
		}
		if(key==2) {
			System.out.println("enter the book name");
			String title2=sc.nextLine();
			
			for(Book arr: al) {
				if(title2.equalsIgnoreCase(arr.getTitle())){
					System.out.println("rename book");
					String title=sc.nextLine();
					arr.setTitle(title);
					System.out.println("rename author");
					String author=sc.nextLine();
					arr.setAuthor(author);
					System.out.println("rename price");
					double price=sc.nextDouble();
					arr.setPrice(price);
					System.out.println("rename no of copies");
					int numberOfCopies=sc.nextInt();
					arr.setNumberOfCopies(numberOfCopies);
					
				}
			}
		}
		if(key==3) {
			System.out.println("enter the book name");
			String title3=sc.nextLine();

			for(Book arr1: al) {
				if(title3.equalsIgnoreCase(arr1.getTitle())){
				al.remove(arr1);
					break;
				}
			}
		}
			
		if(key==4) {
		System.out.println(al);
		}
		if(key==0) {
			istrue=false;
			System.out.println("program has stopped");
		}
		
	
	
	
	}
	
	
}
}
