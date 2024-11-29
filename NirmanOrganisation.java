package day6;

import java.util.Scanner;

public class NirmanOrganisation {
String name;
int id;
String department;
long salary;

void checkIn(String name) {
	System.out.println(name);
}
void checkOut() {
	String value = "Leaved";
	System.out.println(value);
}
	
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	NirmanOrganisation emp1= new NirmanOrganisation();
	emp1.name = "haritha";
	emp1.id = 123;
	emp1.department=" manager";
	emp1.salary= 50000;
	emp1.checkIn("marked");
	
	emp1.checkOut();
	System.out.println(emp1.name);
	
	/*NirmanOrganisation emp2= new NirmanOrganisation();
	emp2.name = Sc.next();
	emp2.id = Sc.nextInt();
	emp2.department= Sc.nextLine();
	emp2.salary= Sc.nextLong();*/
}
}
