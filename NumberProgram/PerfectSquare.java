package Numbers;

import java.util.Scanner;

public class PerfectSquare {
	public static boolean check(int num) {
		for(int i=1;i<num;i++) {
			if(i*i==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Perfect Square":"Not Perfect Square");
	}
}
