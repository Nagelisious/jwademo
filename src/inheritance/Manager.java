package inheritance;

public class Manager extends Employee {
	String departmentName;
	int salary = 18000;
	
	public Manager() {
		//super(); // compiler inserts super();
		System.out.println("Manager default constructor");
	}

	public Manager(String departmentName) {
		super();
		System.out.println("Manager parametrized constructor");
		this.departmentName = departmentName;
	}

	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("Manager parametrized cons - 2 called");
	}
	
	public void displayManagerDetails() {
		int salary = 25000;
		System.out.println("Manager Id: " + employeeId);
		System.out.println("Manager Name: " + employeeName);
		System.out.println("Department Name: " + departmentName);
		System.out.println("Local Salary: " + salary);
		System.out.println("Manager Salary: " + this.salary);
		System.out.println("Employee Salary: " + super.salary);
	}
}
