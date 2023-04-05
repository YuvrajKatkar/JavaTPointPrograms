package Numbers;

import java.util.Scanner;

public class SphenicNumber {
	public static boolean isPrime(int num) {
		for(int i =2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean check(int num) {
		int prod=1;
		for(int i =2;i<num;i++) { 
			for(int j=3;j<num;j++) {
				for(int k=5;k<num;k++) {
					if(i!=j && j!=k  && isPrime(i) && isPrime(j) && isPrime(k)) {
						prod = j *i*k;
						if(prod==num) {return true;}
					}
				}
			}
		}
		System.out.println(prod);
		System.out.println(num);
		return 	false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Sphenic number":"Not Sphenic number");
	}
}
