package Numbers;

import java.util.Scanner;

public class SmithNumber {
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int sum(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	public static int check(int num) {
		int sum=0;
		for(int i = 2;i<num;i++) {
			if(num%i==0 && isPrime(i)==true) {
				sum +=sum(i);
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)==sum(num)?"Smith number":"Not Smith number");
	}

}
