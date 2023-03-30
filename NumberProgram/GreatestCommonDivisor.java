package Numbers;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static int find(int num1, int num2) {
		for(int i=Math.max(num1,num2);i>1;i--) {
			if(num1%i==0 && num2%i==0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number 1: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter a number 2: ");
		int num2 = sc.nextInt();
		System.out.println("GCD is: " +find(num1,num2));
		
	}

}
