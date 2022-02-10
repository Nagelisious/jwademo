package day8;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder(); // 16
		System.out.println("Default capcity: " + sb1.capacity());
		System.out.println("Current length: " + sb1.length());
		
		StringBuilder sb2 = new StringBuilder("Hello"); // 16 + length
		System.out.println("New default capcity: " + sb2.capacity());
		System.out.println("Current length:" + sb2.length());
		
		sb2.append(" Richard");
		System.out.println(sb1);
		System.out.println("Length after adding  Richard:" + sb2.length());
		System.out.println("Current capacity: " + sb2.capacity());
		
		sb2.append("pppppppp");
		System.out.println("Length after adding pppppppp:" + sb2.length());
		System.out.println("Current capacity: " + sb2.capacity());
		
		sb2.append("ppp");
		System.out.println("Length after adding ppp:" + sb2.length()); // 22
		System.out.println("Current capacity: " + sb2.capacity()); // (CC + 1) * 2 = 21
		
		sb2.append("ppppppppppppppppppppp");
		System.out.println("Length after adding ppppppppppppppppppppp:" + sb2.length()); //45
		System.out.println("Current capacity: " + sb2.capacity()); // 90

	}

}
