
public class DemoString {

	public static void main(String[] args) {
		
		String name = "Alexander";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.concat("Revature"));
		System.out.println(name.compareTo("alexander"));
		System.out.println(name.compareToIgnoreCase("alexander"));
		System.out.println(name.substring(4));
		System.out.println(name.toUpperCase());
		System.out.println(name.endsWith("r"));
		System.out.println(name.startsWith("Z"));
	}

}
 