package Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestOf3 {
	public static void main(String[]args) {
		System.out.println("Enter a number1: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter a number2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter a number3: ");
		int num3 = sc.nextInt();
		int[] a = {num1,num2,num3};
		Arrays.sort(a);
		System.out.print("Smallest number of 3 is : ");
		System.out.println(a[0]);
	}
}
