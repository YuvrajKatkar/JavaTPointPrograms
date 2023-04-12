package Patterns;

public class Pattern2 {
	public static void main(String[] args) {
		int k=1 ; int l = 9;
		for(int i =1;i<=4;i++) {
			for(int j =1;j<=9;j++) {
				if(j==5 || j==k || j==l) {
					System.out.print("*");

				}
				else {
					System.out.print("0");
				}
			}
			k++;l--;
			System.out.println();
		}
	}
}
