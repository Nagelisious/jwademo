package inheritance;

class Customer {
	int customerId;
	String customerName;
	
	public int getCustomerId() {
		return customerId;
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE CALLED");
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

}


public class DemoFinalize {
	
	public static void main(String[] args) {
		Customer c1 = new Customer(122, "Richard");
//		Customer c2 = new Customer();
//		Customer c3 = c2;
//		c1 = null;
//		Customer c4 = new Customer();
//		c4 = null;
//		c2 = null;
//		c3 = null;
		
		System.out.println(c1);
		System.out.println(c1.toString());
		System.gc();
	}

}
