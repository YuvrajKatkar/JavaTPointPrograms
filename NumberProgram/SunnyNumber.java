package Numbers;

import java.util.Scanner;

public class SunnyNumber {
	public static boolean check(int num) {
		int next = ++num;
		for(int i=1;i<(next/2);i++) {
			if(next==i*i) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Number is Sunny":"Number is not Sunny");
	}
}
