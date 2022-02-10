package day8;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	public static void main(String[] args) {
		int count = 0;
		String quotes = "Honesty is the best policy and is good policy and is health policy";
		StringTokenizer t = new StringTokenizer(quotes);
		
		System.out.println("Number of words: " + t.countTokens());
		
		while(t.hasMoreTokens()) {
			String temp = t.nextToken();
			if(temp.equals("is")) {
				count++;
			}
		}
		System.out.println("Count of \"is\" in the string: " + count);
	}
}
