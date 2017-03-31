public class Factorial {
	public static int IFactorial(int n) {
		int count = 0;	//Progress Variable
		int partial = 1;	//State Variable
		while (count < n)
			partial *= ++count;
		return partial;
	}

	public static int IFactorial2(int n) {
		int partial = 1;
		for (int count = 1; count <= n; count++)
			partial *= count;
		return partial;
	}

	public static int IFactorial3(int count, int partial, int n) {
		if (count == n)
			return partial;
		else
			return IFactorial3(count + 1, partial * (count + 1), n);
	}

	public static int RFactorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * RFactorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("IFactorial(5): " + IFactorial(5));
		System.out.println("IFactorial2(5): " + IFactorial2(5));
		System.out.println("IFactorial3(0, 1, 5): " + IFactorial3(0, 1, 5));
		System.out.println("RFactorial(5): " + RFactorial(5));
	}
}