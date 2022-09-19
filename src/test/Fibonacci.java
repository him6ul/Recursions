package test;

public class Fibonacci {

	public static void main(String[] args) {
		int count = 10;
		int index = 3;
		int x = getFibonacci(index);
		System.out.println(x);
	}

	private static int getFibonacci(int index) {

		if (index <= 1)
			return 1;

		return getFibonacci(index - 2) + getFibonacci(index - 1);

	}

}
