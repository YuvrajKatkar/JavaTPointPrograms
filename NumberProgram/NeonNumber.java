package Numbers;

import java.util.Scanner;

public class NeonNumber {
		static boolean check(int num){
		int sq = num*num; int sum =0;
		while(sq>0){
		sum += sq%10;
		sq/=10;
		}
		if(sum==num){return true;}
		return false;
		}
	
		public static void main(String[] args){
			System.out.println("Enter a number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(check(num)?"Number is Neon Number":"Number is not Neon Number");
			}		
		}
		

