package day11;

public class organisation {
	public static void main(String [] args){
		employee emp= new employee();
		emp.setName("abi");
		System.out.println(emp.getName());
		emp.setId(23);
		System.out.println(emp.getId());
		emp.setDepartment("finance");
		System.out.println(emp.getDepartment());
		emp.setAge(24);
		System.out.println(emp.getAge());
		;
		
		employee emp2 = new employee("abinaya", 100, "manager", 24);
		System.out.println(emp2.getDepartment());
		System.out.println(emp2.getAge());
		System.out.println(emp2.getName());
		System.out.println(emp2.getDepartment());
		
		int a= emp2.getAge();
		System.out.println(a);
		System.out.println(emp2.toString());
	}
}
