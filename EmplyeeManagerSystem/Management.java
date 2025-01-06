package EmplyeeManagerSystem;
import java.util.Scanner;
import java.util.ArrayList;

public class Management {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Employee emp = new Employee();
	ArrayList<Employee> al=new ArrayList<Employee>();
	boolean istrue=true;
	
	while(istrue) {
		
		System.out.println("Select a Option: ");
		System.out.println("1: Add details");
		System.out.println("2: Remove details details");
		System.out.println("3: Search employee details ");
		System.out.println("4: show details");
		System.out.println("0: exit program");
		System.out.println("enter your choice:"); 
		int key = sc.nextInt();
		sc.nextLine();
		
		if(key==1) {
			
			System.out.println("Enter Employee Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Employee ID: ");
			int empId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Employee Phone Number: ");
			long phoneNo = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter Employee Department: ");
			String department = sc.nextLine();
			
			//al.add(empId, name, phoneNo,department);
			al.add(emp = new Employee(name, empId, phoneNo, department) );
			
		}
		
		if(key==2) {
			System.out.println("enter the id");
			int id1 = sc.nextInt();
			boolean isThere1= false;
			for(Employee arr1: al) {
				if(id1 == arr1.getEmpId()) {
				isThere1= true;
				al.remove(arr1);
					break;
				}}
			if(!isThere1) {
				System.out.println("book not found");
			}
		}
		
		if(key==3) {
			System.out.println("enter the id");
			int id2 = sc.nextInt();
			boolean isThere1= false;
			for(Employee arr2: al) {
				if(id2 == arr2.getEmpId()) {
				isThere1= true;
				System.out.println(arr2);
				
				
				//al.get(id2);
				//al.get(arr2);
				//al.get(id1);
					break;
				}}
			if(!isThere1) {
				System.out.println("book not found. enter correct number");
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