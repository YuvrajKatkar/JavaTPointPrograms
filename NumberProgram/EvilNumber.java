package Numbers;

import java.util.Scanner;

public class EvilNumber {
	public static int binary(int num) {
		String binary = "";
		while(num>0) {
			binary = binary +(char)num%2;
			num/=2;
		}
		binary = binary + (char)num/2;
		System.out.println(binary);
		return Integer.parseInt(binary);
	}
	public static boolean check(int num) {
		int count =0;
		while(num>0) {
			if(num%10==1) {
				count++;
			}
			num/=10;
		}
		if(count%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println((check(binary(num)))?"Evil number":"Not Evil number");
	}
}
