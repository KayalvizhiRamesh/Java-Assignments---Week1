package week1.day1.assignments;

public class Factorial {
	
	public static void main(String[] args) {

		// Declare your input as 5
		int input = 5;
		int fact = 1;
		
		for (int i =1; i<=input; i++) {
			fact = i*fact;
		}
		System.out.println(fact);
		
	}
}