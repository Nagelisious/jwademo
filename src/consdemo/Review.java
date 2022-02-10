package consdemo;

public class Review {
	private int reviewId;
	private String reviewGivenBy;
	private int rating;
	
	public static int reviewCount;
	
	public Review() {
		reviewId = -1;
		reviewGivenBy = "NotAvailable";
		rating = -1;
	}

	public Review(int reviewId, String reviewGivenBy) {
		this();
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
	}

	public Review(int reviewId, String reviewGivenBy, int rating) {
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
		this.rating = rating;
	}
	
	public Review(int reviewId, String reviewGivenBy, int rating, int reviewCount) {
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
		this.rating = rating;
		this.reviewCount = reviewCount;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewGivenBy() {
		return reviewGivenBy;
	}

	public void setReviewGivenBy(String reviewGivenBy) {
		this.reviewGivenBy = reviewGivenBy;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
