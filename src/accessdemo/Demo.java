package accessdemo;

class Employee {
	int salary = 98000;
	public void display() {
		System.out.println(salary);
	}
}

class Manager extends Employee {
	public void display() {
		System.out.println(salary);
	}
}

class Clerk {
	public void display() {
		Employee e = new Employee();
		System.out.println(e.salary);
	}
}

public class Demo {

	public static void main(String[] args) {
		Manager m = new Manager();
		Clerk c = new Clerk();
		m.display();
		c.display();
	}

}
