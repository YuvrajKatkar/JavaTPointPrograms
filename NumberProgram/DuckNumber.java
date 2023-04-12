package Numbers;

import java.util.Scanner;

public class DuckNumber {
	public static boolean check(String n) {
		int num = Integer.parseInt(n);
		int countOfZero=0; 
		int Countwith0 = n.length();
		System.out.println(n);

		int num1 = num;
		String CountwithOutZero = ""+num1;
		int CountwithOut0 = CountwithOutZero.length();
		System.out.println(CountwithOutZero);
		while(num>0) {
		if(num%10==0) {
			countOfZero++;
		}
		num/=10;
		if(Countwith0!=CountwithOut0) {
			return false;
		}
		if(countOfZero>0 && num>0) {
			return true;
		}
		}
		return false;
	}
	static int count(int num){
        int count =0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
	static boolean duck(int num1){
        int num[] = new int[count(num1)];int count=0;
        for(int i=count(num1)-1;i>=0;i--){
            num[i]=num1%10;num1/=10;
            if(num[i]==0){
                count++;
            }
        }
        if(num[0]!=0&&count>0) {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int num1 = Integer.parseInt(num);
		System.out.println(check(num)?"Duck number":"Not Duck number");
		System.out.println(duck(num1));
	}
}
