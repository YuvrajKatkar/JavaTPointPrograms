package Patterns;

public class Pattern7 {
		public static void main(String[] args) {
			int num =9;
			for(int i = 1;i<=5;i++) {
				for(int k = 1;k<=i;k++) {
					System.out.print(" ");

				}
				for(int j = num ;j>=1;j--) {
					
					System.out.print("*");
				}
				num=num-2;
				System.out.println();
			}
		}

}
