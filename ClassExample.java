package day5;

public class ClassExample { //classexample: class name
	
	String name;
	long rollno;
	int age;
	String gender;
	
	public static void main(String[] args) {
		ClassExample student = new ClassExample(); //student: obj name
		student.name= "abi";
		student.rollno = 13567;
		student.age= 15;
		student.gender="female";
		
		System.out.println(student.rollno);
		
		ClassExample student2 = new ClassExample();
		student2.name= "ananya";
		student2.rollno = 6;
		student2.age= 16;
		student2.gender="female";
		
		System.out.println(student2.age);
	}

}
