package patterns;

public class Pattern1 {
	public static void main(String[] args) {
		int start=4;
		for (int i = 1; i <= 5; i++) {
			
			for(int j = start;j>=1;j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			start--;System.out.println();
		}
	}
}
