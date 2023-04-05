package Numbers;

import java.util.Scanner;

public class SpyNumber {
	
		static boolean check(int num){
		int sum =0; int pro = 1; int num1 = num;
		while(num>0){
		sum += num%10;
		pro *= num%10;
		num/=10;
		}
		if(sum!=pro){return false;}
		return true;
		}
		public static void main(String[] args){
			System.out.println("Enter a number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(check(num)?"Number is Spy Number":"Number is not Spy Number");
		}
		}

