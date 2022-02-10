package inheritance;

public class Employee {
	int employeeId;
	String employeeName;
	int salary = 9000;

	public Employee() {
		System.out.println("Employee default constructor");
	}

	public Employee(int employeeId, String employeeName) {
		System.out.println("Employee parametrized constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void submitDocuments() {
		System.out.println("Submitting documents");
	}
}
