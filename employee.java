package day11;

public class employee {
	private String name;
	private int id;
	private String department;
	private int age;

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getDepartment() {
		return department;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	employee(){	
	}
	
	employee(String name, int id, String department, int age){
		this.name=name;
		this.id=id;
		this.department=department;
		this.age=age;
	}
	
	public String toString() {
		return "Name: "+name +" Age: "+age+" Department: "+department+ "ID: "+id;
	}
	
}
