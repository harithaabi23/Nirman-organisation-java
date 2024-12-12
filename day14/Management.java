package day14;
import java.util.Scanner;

public class Management {
	
	public static void main(String[] args) {
		Employee emp = new Employee("Abi", 123, 67890,"Finance");
		Scanner sc= new Scanner(System.in);
		boolean isTrue= true;
		boolean isCorrect= true;
		int choice;
		
		while(isTrue) {	
			System.out.println("Select a Option: ");
			System.out.println("1 = add details");
			System.out.println("2 = update details");
			System.out.println("3 = show details");
			System.out.println("0 = exit");
			System.out.println("enter your choice:"); 
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1: {
				
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
				
				emp = new Employee(name, empId, phoneNo, department);
				break;
			}
			
			case 2:{
								while(isCorrect) {
									
									System.out.println("Select the field to update:");
								    System.out.println("1. Update Employee NAME");
								    System.out.println("2. Update Employee ID");
								    System.out.println("1. Update Employee phoneNo");
								    System.out.println("2. Update Employee Department");
								    System.out.println("0. Go Back");
								    System.out.println();
								    
									int updateChoice = sc.nextInt();
								    sc.nextLine();
												
									switch(updateChoice){
									case 1:{
										System.out.println("Enter new Employee Name: ");
							            String newName = sc.nextLine();
							            emp.setName(newName);  
							            System.out.println("Employee Name successfully updated.");
										break;
									}
									
									case 2:{
										System.out.println("Enter new Employee ID: ");
							            int newId = sc.nextInt();
							            sc.nextLine();
							            emp.setEmpId(newId); 
							            System.out.println("Employee ID successfully updated.");
										break;
									}
									
									case 3:{
										System.out.println("Enter new Employee Phone Number: ");
							            int newphno = sc.nextInt();
							            sc.nextLine();
							            emp.setPhoneNo(newphno); 
							            System.out.println("Employee phone Number successfully updated.");
							            break;
									}
									
									case 4:{
										System.out.println("Enter new Employee Department: ");
							            String newdept = sc.nextLine();
							            emp.setDepartment(newdept);  
							            System.out.println("Employee Department successfully updated.");
							            break;
									}
									case 0:{
										System.out.println("Back To Main Menu");
										isCorrect=false;
										break;
									}
									
									default:{
										//isTrue = false;
										System.out.println("Enter correct choice");
										System.out.println(" ");
										break;
										}
									}							
									
								}
				break;
			}
			
			case 3:{
				System.out.println("Employee Details: ");
				System.out.println(emp.toString());
				break;
			}
			
			case 0:{
				isTrue=false;
				System.out.println("Thank you");
				break;
			}
			
			
		default:{
			isTrue = false;
			System.out.println("Enter correct option");
			System.out.println(" ");
			break;
			}
	
	}		
}
}
}