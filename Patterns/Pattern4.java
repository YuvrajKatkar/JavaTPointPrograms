package Patterns;

public class Pattern4 {
	public static void main(String[] args) {
		for(int i = 1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(j==i || j+i==8) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = 3;i>=1;i--) {
			for(int j = 1;j<=7;j++) {
				if(j==i || j+i==8) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
