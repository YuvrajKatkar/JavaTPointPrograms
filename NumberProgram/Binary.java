package string;

import java.util.Arrays;

public class Binary {
    static int count(int num){
        int count =0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    static String binary(int num){
        String ans ="";
        while(num>0){
            ans += String.valueOf(num%2);
            num/=2;
        }
        ans.concat(String.valueOf(num/2));
        StringBuffer sb = new StringBuffer(ans);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(binary(5));
    }
}
