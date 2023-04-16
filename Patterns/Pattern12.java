package Patterns;

public class Pattern12 {
	public static void main(String [] args) {
		int num = 1;
		for(int i=1;i<=5;i++) {
			for(int j = 5;j>=i;j--) {
				System.out.print("  ");
			}
			for(int j = 1 ; j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println();
			num = num+2;
		}
	}
}
