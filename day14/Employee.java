package day14;

public class Employee {
	private String name;
	private int empId;
	private long phoneNo;
	private String department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", phoneNo=" + phoneNo + ", department=" + department + "]";
	}
	
	 Employee(String name, int empId, long phoneNo, String department) {
		this.name = name;
		this.empId = empId;
		this.phoneNo = phoneNo;
		this.department = department;
	}
	public Employee() {
	}
	
	
	
	
	
}
