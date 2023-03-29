package Numbers;
import java.util.Scanner;
public class BouncyNumber {
	public static boolean check(int num) {
		int plus =0; int minus = 0;
		while(num>10){
		int rem1 = num%10;
		int rem2 = (num/10)%10;

		if(rem1>rem2){plus++;
		}
		else{minus++;}
		if(plus>0 && minus>0){
			return true;
		}
		num/=10;

		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(check(num)?"Number is Bouncy":"Number is not Bouncy");
	}

}
