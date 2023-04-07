package Numbers;

import java.util.Scanner;

public class StrontioNumber {
	
	public static boolean check(int num) {
		String n = ""+num;
		if(n.length()==4) {
			int num2 = (num*2)/10;
			int tens= num2%10;
			int hund = (num2/10)%10;
			System.out.println(tens);
			System.out.println(hund);

			if(tens==hund) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Strontio number":"Not Strontio number");
	}

}
