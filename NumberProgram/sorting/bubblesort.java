package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {45,12,23,65,87,89,45};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
