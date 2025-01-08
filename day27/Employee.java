package day27;

import java.io.Serializable;

public class Employee implements Serializable{
	String name;
	long phno;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phno=" + phno + "]";
	}

	public Employee(String name, long phno) {
		super();
		this.name = name;
		this.phno = phno;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
