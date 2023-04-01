package Numbers;

import java.util.Scanner;

public class MysteryNumber {
	public static int reverse(int num) {
		int rev =0;
		while(num>0) {
			rev = rev*10 + num%10;
			num/=10;
		}
		return rev;
	}
	public static boolean check(int num) {
		int rev = 1;
		for(int i =1;i<=(num/2);i++) {
			rev = reverse(i);
			if(i+rev==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Mystery number":"Not Mystery number");
	}
}
