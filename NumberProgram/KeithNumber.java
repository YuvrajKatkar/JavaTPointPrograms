package Numbers;

import java.util.Scanner;

public class KeithNumber {
	public static int count(int num) {
		int count =0;
		count = (""+num ).length();
		return count;
	}
	public static boolean check(int num) {
		int count = count(num); int sum=0;
		int[] arr = new int[count];
		for(int i =arr.length-1;i>=0;i--) {
			arr[i] = num%10;
			num/=10;
		}
		while(sum<num) {
			sum = arr[0];
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=arr[i+1];
				sum+=arr[i];
			}
			arr[arr.length-1]=sum;
			
		}
		if(sum==num) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Keith number":"Not keith number");
	}
}
