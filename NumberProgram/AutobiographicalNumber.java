package Numbers;
import java.util.Scanner;

public class AutobiographicallyNumber {
	public static int count(int num, int key) {
		int count=0;
		while(num>0) {
			if(num%10==key) {
				count++;
			}
			num/=10;
		}
		return count;
	}
	public static int count(int num) {
		int count=0;
		while(num>0) {
				count++;
			num/=10;
		}
		return count;
	}
	public static boolean check(int num) {
		int num1=num;
		//HashMap<Integer,Integer> hs = new HashMap<>();int count =0;
		int[] a=new int[count(num)];
		for(int i=count(num)-1;i>=0;i--) {
			a[i] = num%10;
			num/=10;
			//System.out.print(a[i]);

		}
		
		for(int i =0;i<a.length;i++) {
			//System.out.print(a[i]+" ");
			if(a[i]!=count(num1,i)) {
				return false;
			}
		}
		return true;
	}
	static boolean auto(int num){
        int []num1 = new int[4];
        for(int i=3;i>=0;i--){
            num1[i]=num%10; num/=10;
        }
        for(int i=0;i<num1.length;i++){
            int count=0;
            for(int j=0;j<num1.length;j++){
                if(i==num1[j]){
                    count++;
                }
            }

            if(count!=num1[i]){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num)?"Autobiographical number":"Not Autobiographical number");
		System.out.println(auto(num));
	}
}
