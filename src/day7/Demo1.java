package day7;

// method overloading
public class Demo1 {

	public void add(int num1, int num2) {
		System.out.println("Adding two numbers: " + (num1 + num2));
	}
	
	public void add(String num1, int num2) {
		System.out.println("Adding one string and one number: " + (num1 + num2));
	}
	
	public void add(int num2, String num1) {
		System.out.println("Adding one number and one string: " + (num2 + num1));
	}
	
	public void add(String firstName, String lastName) {
		System.out.println("Adding two strings: " + (firstName + lastName));
	}
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.add(10, 10);
		d.add("H", 90);
		d.add(90, "Q");
		d.add("Richard", "Davis");
		
		System.out.println(90);
		System.out.println(true);
		System.out.println("Hello");
		System.out.println(89.98);
	}

}
