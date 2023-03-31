package Numbers;

import java.util.Scanner;

public class EmirpNumber {
	public static boolean checkPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				//System.out.println(num + " "+i);
				return false;
			}
		}
		return true;
	}
	public static int reverse(int num) {
		int rev =0;
		while(num>0) {
			rev = rev*10 + num%10;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//System.out.println(checkPrime(num));
		System.out.println(checkPrime(num)==true&&(checkPrime(num))==checkPrime(reverse(num) )?"Emirp number":"Not Emirp number");
	}
}
