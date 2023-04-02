package Numbers;

import java.util.Scanner;

public class nthPrimeNumber {
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void check(int num) {
		int count=0;
		for(int i = 2;i<=2000;i++) {
			if(isPrime(i)==true) {
				count++;
				if(count==num) {
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		check(num);
	}

}
