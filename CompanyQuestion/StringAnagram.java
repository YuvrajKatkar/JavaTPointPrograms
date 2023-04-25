package CompanyQuestion;

import java.util.Arrays;

public class StringAnagram {
	static public boolean check(String s1, String s2) {
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		Arrays.sort(c2);
		Arrays.sort(c1);
		for(int i=0;i<c1.length;i++) {
			if (c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 ="silent!";
		System.out.println(check(s1, s2)?"Yes":"No");
	}
}
