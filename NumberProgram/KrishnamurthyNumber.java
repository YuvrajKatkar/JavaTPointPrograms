package Numbers;

import java.util.Scanner;

public class KrishnamurthyNumber {
	static int fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static boolean checkPeterson(int num) {
		int sum = 0;int num1 = num;
		while(num>0) {
			sum += fact(num%10);
			num/=10;
		}
		
		if(sum!=num1) {
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkPeterson(num)?"Number is Krishnamurthy":"Number is not Krishnamurthy");
}
}
