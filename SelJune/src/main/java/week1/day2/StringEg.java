package week1.day2;

public class StringEg {
	public static void main(String[] args) {
		String comname ="dinesh";
		int length = comname.length();
		String rev="";
		
		for (int i=length-1;i>=0;i--) {
			rev+=comname.charAt(i);
			
		}
		
		if(rev.equals(comname)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Plaindrome");
		}
			
		
					
	}
}
