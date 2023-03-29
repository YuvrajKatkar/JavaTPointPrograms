package Numbers;
import java.util.Scanner;



public class AutomorphicNumber {
	
	public static boolean checkAuto(int num) {
		int square = num*num;
		while(num>0) {
			if(square%10 != num%10) {
				return false;
			}
			square/=10;
			num/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkAuto(num)?"Number is automorphic":"Number is not Automorphic");
}

}
	