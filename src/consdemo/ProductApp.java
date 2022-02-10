package consdemo;

public class ProductApp {
	
	public static void main(String[] args) {
		Product1 p1 = new Product1(1, "Lakme", 199, 99);
		Product1 p2 = new Product1(1, "Lakme", 199, 99);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
		
		Product1 p3 = p1;
		System.out.println(p1.equals(p3));
		System.out.println(p1 == p3);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}
}
