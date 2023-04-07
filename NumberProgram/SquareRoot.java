package Numbers;

import java.util.Scanner;

public class SquareRoot {
	public static int check(int num) {
		for(int i =1;i<(num/2);i++) {
			if(i*i==num) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num));
	}
}
