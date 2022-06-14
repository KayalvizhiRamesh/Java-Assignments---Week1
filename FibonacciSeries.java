package week1.day1.assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {

		int firstNum = 0;
		int secNum = 1;
		int range = 10;
		int sum;
		System.out.println(firstNum);
		for (int i = 1; i < range; i++) {
			sum = firstNum + secNum;
			secNum = firstNum;
			firstNum = sum;
			System.out.println(sum);
		}

	}

}  


