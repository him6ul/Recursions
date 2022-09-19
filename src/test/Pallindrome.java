package test;

public class Pallindrome {

	public static void main(String[] args) {
		String s = "kayak1";
		boolean isPallindrome = isPallindrome(s);
		System.out.println("isPallindrome -> " + isPallindrome);
	}

	private static boolean isPallindrome(String s) {

		if (s.length() == 1)
			return true;
		
		if ((s.charAt(0)) == s.charAt(s.length() - 1))
			return isPallindrome(s.substring(1, s.length() - 1));

		return false;
	}

}
