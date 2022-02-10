import finance.Fee;

public class Client {

	public static void main(String[] args) {
		// full name of package
		maths.Calculator c = new maths.Calculator();
		System.out.println(c.addNumbers(9, 9));
		
		// import package
		Fee f = new Fee();
		f.takeFees(7600);
	}

}
