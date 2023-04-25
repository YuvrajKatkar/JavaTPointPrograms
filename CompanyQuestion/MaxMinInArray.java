package CompanyQuestion;

import java.util.Iterator;

public class MaxMinInArray {
	public static void find(int a[]) {
		int min=a[0];int minIndex=0;
		int max=a[0];int maxIndex=0;
		for(int i =0;i<a.length;i++) {
			if (a[i]>max) {
				maxIndex=i;
				max=a[i];
			}
			else if (a[i]<min) {
				minIndex=i;
				min=a[i];
			}
		}
		System.out.println("min value is " +a[minIndex]);
		System.out.println("min value at index "+minIndex );
	
	System.out.println("max value is" + a[maxIndex]);
	System.out.println("max value at index" +maxIndex);
	}
	public static void main(String[] args) {
		int a[] = {32,42,67,57,11,12,45,94,55,87};
		find(a);
	}
}
