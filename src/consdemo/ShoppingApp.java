package consdemo;

public class ShoppingApp {

	public static void main(String[] args) {
		Review review1 = new Review(10182, "Daniel", 5, 91762);
		review1.setRating(4);
		review1.reviewCount++;
		System.out.println(review1.getReviewGivenBy());
		System.out.println(review1.getRating());
		System.out.println(review1.reviewCount); // 91763
		
		// each and every object will have 
		// separate copy of instance variables
		Review review2 = new Review(10185, "Richard", 5, 10);
		review2.reviewCount++;
		// static variables are shared between all objects
		System.out.println(review1.reviewCount); // 11
		System.out.println(review2.reviewCount); // 11
		System.out.println(Review.reviewCount); // 11
	}
}
