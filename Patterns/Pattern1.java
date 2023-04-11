package Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				
				if(k==j) {
					System.out.print("*");
				}
				else {
					System.out.print(j);	
				}
				
			}
			System.out.println();
			k++;
		}
	}

}
