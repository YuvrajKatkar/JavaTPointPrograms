package Numbers;

import java.util.Scanner;

public class XylemPhloemNumber {
	public static boolean check(int num) {
		int sum1 = num%10;int sum2=0;
		num/=10;
		while(num>9) {
			sum2 +=num%10;
			num/=10;
		}
		sum1+=num;
		if(sum1==sum2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Xylem number":"Phloem number");
	}

}
