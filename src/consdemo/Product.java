package consdemo;

public class Product {
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	int star;
	
	// default constructor - used to initialize
	public Product() {
		System.out.println("PRODUCT DEFAULT CONSTRUCTOR CALLED");
		productId = -1;
		productName = "NotAvailable";
		quantityOnHand = -1;
		price = -1;
		star = -1;
	}
	
	public Product(int productId, String productName, int quantityOnHand) {
		this();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
	}

	public Product(int productId, int price, int star) {
		this.productId = productId;
		this.price = price;
		this.star = star;
	}

	// parametrized constructor
	public Product(int productId, String productName, int quantityOnHand, int price, int star) {
		this();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.star = star;
	}

	public void printProductDetails() {
		int star = 4;
		System.out.println("Product Id: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Quantity On Hand: " + quantityOnHand);
		System.out.println("Price: "+ price);
		System.out.println("Star: " + star);
		System.out.println("Instance Star: " + this.star);
	}
	
	
	
	public static void main(String[] args) {
		Product product1 = new Product();
		System.out.println("---Printing the details about product1:");
		product1.printProductDetails();
		
		System.out.println("---Printing details about new product constructor:");
		new Product().printProductDetails();
		
		System.out.println("---Printing details about product3:");
		Product product3 = new Product(2, "Aroma", 12, 99, 3);
		product3.printProductDetails();
		
		System.out.println("---Printing details about product4:");
		Product product4 = new Product(768, "Pendrive", 99);
		product4.printProductDetails();
		
		System.out.println("---Printing details about product5:");
		Product product5 = new Product(500, 89, 3);
		product5.printProductDetails();
				
	}
}
