package Patterns;

public class SpiralPattern {
	
    public static void main(String[] args){
        int i = 1;
        int [][]Mat = new int[5][5];
        int minRow  = 0, minCol = 0, maxRow = 4, maxCol = 4;
        while(i<=5*5) {
            //first cycle
            for(int j = minCol;j<=maxCol;j++) {
                Mat[minRow][j] = i++;
            }
            for(int j = minRow+1;j<=maxRow;j++) {
                Mat[j][maxCol] = i++;
            }
            for(int j = maxCol-1;j>=minCol;j--) {
                Mat[maxRow][j] = i++;
            }
            for(int j = maxRow-1;j>=minRow+1;j--) {
                Mat[j][minCol] = i++;
            }
            minCol++;minRow++;maxCol--;maxRow--;
        }
        for(int i1 = 0; i1<5;i1++) {
            for(int j = 0;j<5;j++) {
                System.out.print(Mat[i1][j]+"  ");
            }
            System.out.println();
        }
        
    }
}

