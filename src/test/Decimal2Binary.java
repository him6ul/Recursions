package test;

public class Decimal2Binary {

	private static String s = "";

	public static void main(String[] args) {
		
		decimal2Binary(223);
		
		System.out.println(s);
	}

	private static void decimal2Binary(int x) {

		if (x > 1) {
			int y = Math.floorMod(x, 2);

			s = s.concat(String.valueOf(y));

			decimal2Binary(Math.floorDiv(x, 2));
		}
	}
}
