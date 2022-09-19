package test;

public class StringReversal {

	private static String result = "";

	public static void main(String[] args) {
		String s = "The simple engineer";
		reverseString(s);
		System.out.println("Original String -> " + s);
		System.out.println("Reversed String -> " + result);
		System.out.println("Reversed String1 -> " + revereString1(s));
	}

	private static String reverseString(String s) {
		if (s.length() > 0) {

			String lastChar = s.substring(s.length() - 1);

			result += lastChar;
			String strRemaining = s.substring(0, s.length() - 1);

			return reverseString(strRemaining);
		}
		return null;
	}

	public static String revereString1(String s) {
		if (s.equals(""))
			return "";

		return revereString1(s.substring(1) + s.charAt(0));
	}
}
