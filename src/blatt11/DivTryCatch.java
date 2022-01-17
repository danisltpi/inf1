package blatt11;

public class DivTryCatch {

	public static int div(int z, int n) {
		int i = Integer.MAX_VALUE;
		try {
			i = z / n;
		} catch(ArithmeticException e) {
			System.err.println("Fehlergrund: " + e.getMessage());
			e.printStackTrace(System.err);
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println(div(100, 0));
	}
}
