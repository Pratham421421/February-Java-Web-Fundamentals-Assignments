package march_14_Assignment;

class Employee{
	int id;
	String name;
	String department;
	public static String worklocation="Mumbai";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
		
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + " worklocation="+worklocation+"]";
	}	
}

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Prathamesh Harad","Java developer");
		System.out.println(e1);
		Employee e2=new Employee(2,"Shashank Bhondave","Trainee");
		System.out.println(e2);
		Employee e3=new Employee(3,"Darpan Patil","Security");
		System.out.println(e3);		
	}
}
