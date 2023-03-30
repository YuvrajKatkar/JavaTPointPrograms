package Numbers;

import java.util.Scanner;

public class ISBN {
	public static boolean check(long num) {
		long sum = 0;long i =10;
		while(num>0) {
			sum = sum + (i*(num%10));
			num/=10;
			i--;
		}
	
		if(sum%11==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.println(check(num)?"ISBN number":"Not ISBN number");
	}

}
