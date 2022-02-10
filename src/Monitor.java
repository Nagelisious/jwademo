
public class Monitor {
	
	int num = 900;
	
	{ // third called
		System.out.println("INITIALIZER");
	}
	
	static { // first called
		System.out.println("STATIC INITIALIZER CALLED");
	}
	
	public Monitor() { // fourth called
		System.out.println("Monitor constructor called");
	}
	
	public void display() { // fifth called
		System.out.println("Display called and value of num is: " + num);
	}
	
	public static void main(String[] args) {
		System.out.println("MAIN CALLED"); // second called
		Monitor m1 = new Monitor();
		m1.display();
		Monitor m2 = new Monitor();
	}

}
