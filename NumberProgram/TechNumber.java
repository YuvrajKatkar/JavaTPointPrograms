package Numbers;

import java.util.Scanner;

public class TechNumber {
	public static int count(int num) {
		int count =0;
		while(num>0) {
			count++; 
			num/=10;
		}
		return count;
	}
	public static boolean check(int num) {
		int n = num;
		if(count(num)%2==0) {
			int num1;
			int num2;
			int div=1;
			for(int i =1;i<=count(num)/2;i++) {
				div = div*10;
			}
			num1 = n/div;
			num2 = n%div;
			int add=num1+num2;
			if(add*add == n) {
				return true;
			}
			
		}
		return false;
		
		
		
	}
	public static void main(String args[]) {
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println(check(num)?"Number is Tech Number":"Number is not Tech");
	}
}
