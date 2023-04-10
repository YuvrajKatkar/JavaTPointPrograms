package Numbers;

import java.util.Scanner;

public class SumOfNaturalNumber {
	public static int sum(int num) {
		int sum = num*(num+1)/2;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sum(num));
		
	}
}
