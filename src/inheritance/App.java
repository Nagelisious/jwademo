package inheritance;

public class App {

	public static void main(String[] args) {
		Manager m = new Manager(109, "David");
		m.departmentName = "HR";
		m.displayManagerDetails();
	}
}
