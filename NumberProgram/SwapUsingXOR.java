package Numbers;

import java.util.Scanner;

public class SwapUsingXOR {
	public static int binary(int num) {//3
		int temp = num%2;//1
		String n = ""+temp;//1
		num/=2;//1
		while(num>0) {
			n +=num%2;
			num/=2;
		}
		//n+=num/2;
		//System.out.println(n);
		StringBuffer sb = new StringBuffer(n);
		sb.reverse();
		return Integer.parseInt(sb.toString());
	}
	public static void swap(int b1, int b2) {
		
		System.out.println("Before swapping");
		System.out.println("num1: " +b1);
		System.out.println("num2: " +b2);
		b1 = b1^b2;
		b2 = b1^b2;
		b1 = b1^b2;
		
		System.out.println("after swapping");

		System.out.println("num1: " +b1);
		System.out.println("num2: " +b2);

	}
	public static void main(String[] args) {
		System.out.println("Enter a number1: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter a number2: ");
		int num2 = sc.nextInt();

		swap(num1,num2);;
	}

}
