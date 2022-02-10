import java.util.Date;
import java.util.Scanner;

public class Demo1 {

	public void printWelcomeMessage() {
		System.out.println("Hi, welcome to Revature training");
	}
	
	// var args ...
	public int addNumbers(int...num) {
		// enhanced for loop
		int sum = 0;
		for(int i : num) {
			sum += i;
		}
		return sum;
	}
	
	public void printProductNames(String...productName) {
		for(String p : productName) {
			System.out.println(p);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello and welcome to day 2 training");
		Demo1 d = new Demo1();
		d.printWelcomeMessage();
		int result = d.addNumbers(7, 7, 2, 23);
		System.out.println(result);
		d.printProductNames("Watch", "Pendrive", "Adaptor");
		System.out.println("\n========================\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		sc.close();
		System.out.println("You are " + age + " years old");
		
		Date date = new Date();
		System.out.println(date);
	}

}
