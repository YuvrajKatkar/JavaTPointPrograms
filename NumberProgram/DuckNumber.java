package Numbers;

import java.util.Scanner;

public class DuckNumber {
	public static boolean check(String n) {
		int num = Integer.parseInt(n);
		int countOfZero=0; 
		int Countwith0 = n.length();
		System.out.println(n);

		int num1 = num;
		String CountwithOutZero = ""+num1;
		int CountwithOut0 = CountwithOutZero.length();
		System.out.println(CountwithOutZero);
		while(num>0) {
		if(num%10==0) {
			countOfZero++;
		}
		num/=10;
		if(Countwith0!=CountwithOut0) {
			return false;
		}
		if(countOfZero>0 && num>0) {
			return true;
		}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		System.out.println(check(num)?"Duck number":"Not Duck number");
	}
}
