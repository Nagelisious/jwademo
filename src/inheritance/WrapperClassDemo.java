package inheritance;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);
		
		long salary1 = 91716;
		Long salary2 = 91716l;
		
		int marks = 100;
		Integer newMarks1 = new Integer(marks); // boxing
		Integer newMarks2 = marks; // auto boxing
		
		Double budget = 19272.87;
		double newBudget1 = Double.valueOf(budget); // unboxing
		double newBudget2 = budget; // auto unboxing
	}

}
