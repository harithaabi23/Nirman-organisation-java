package day22;
import java.util.ArrayList;
import java.util.Scanner;
public class Management1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book1 book=new Book1();
		ArrayList<Book1> al=new ArrayList<Book1>();
		boolean istrue=true;
		
		while(istrue) {
			System.out.println("Select an option:");
			System.out.println("1. Add Book Details");
			System.out.println("2. update Book Details");
			System.out.println("3 remove details");
			System.out.println("4 display data");
			System.out.println("0. Exit");
			System.out.println("enter your choice");
			int key=sc.nextInt();
			sc.nextLine();
			if(key==1) {
				System.out.println("enter book id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("enter book title");
				String title=sc.nextLine();
				
				System.out.println("author name");
				String author=sc.nextLine();
				System.out.println("enter the price");
				double price=sc.nextDouble();
				System.out.println("no of copies");
				int numberOfCopies=sc.nextInt();
				
				al.add(book=new Book1(id,title, author, price, numberOfCopies));	
			}
			
			if(key==2) {
				System.out.println("enter the id");
				int id1 = sc.nextInt();
				boolean isThere= false;
				for(Book1 arr: al) {
					if(id1 == book.getId()){
						isThere= true;
						System.out.println("rename book");
						String title=sc.nextLine();
						sc.nextLine();
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
				if(!isThere) {
					System.out.println("book not found");
				}
			}
			
			if(key==3) {
				System.out.println("enter the id");
				int id1 = sc.nextInt();
				boolean isThere1= false;
				for(Book1 arr1: al) {
					if(id1 == book.getId())
					isThere1= true;
					al.remove(arr1);
						break;
					}
				if(!isThere1) {
					System.out.println("book not found");
				}
			}
				
			if(key==4) {
			System.out.println(al);
			}
			
			if(key==0) {
				istrue=false;
				System.out.println("program exited");
			}	
		}
		
		
	}
}
