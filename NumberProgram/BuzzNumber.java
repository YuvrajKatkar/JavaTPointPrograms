package Numbers;

import java.util.Scanner;

public class BuzzNumber {
	public static boolean check(int num) {
		if(num%7==0 || num%10==7) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Buzz number":"Not Buzz number");
	}
}
