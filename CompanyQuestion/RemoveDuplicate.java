package CompanyQuestion;

public class RemoveDuplicate {
	public static void removeDuplicate(String s1) {
		s1= s1.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					s1 = s1.substring(0,j) + s1.substring(j+1);
					//System.out.println(s1);
				}
			}
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
	 String s1 = "goodmorning";
	 removeDuplicate(s1);
	}
}
