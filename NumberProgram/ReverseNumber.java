package Numbers;
import java.util.Scanner;

public class ReverseNumber {
	static int reverse(int num) {
		int sum = 0;
		while(num>0) {
			sum = sum*10 + num%10;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(reverse(num));
	}
}
