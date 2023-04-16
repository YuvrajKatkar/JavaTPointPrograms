package Patterns;

public class RectanglePattern {
	public static void main(String[] args) {
		int n = 5; int num =1;
		int minRow=0,minCol=0,maxRow=4,maxCol = 4;
		int [][]a = new int[n][n];
		while(num<=16) {
			for(int i = minCol;i<=maxCol;i++) {
				a[minRow][i] = num++;
			}
			for(int i = minRow+1;i<=maxRow;i++) {
				a[i][maxCol] = num++;
			}
			for(int i = maxCol-1;i>=minCol;i--) {
				a[maxRow][i] = num++;
			}
			for(int i = maxRow-1;i>minRow;i--) {
				a[i][minCol]= num++;
			}
			minCol++;maxCol--;minRow++;maxRow--;
		}
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(a[i][j]!=0) {
					System.out.print(a[i][j] + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
