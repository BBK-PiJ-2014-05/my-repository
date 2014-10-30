public class factorial {

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		} else {

		int num = n * fact(n-1);
		return num;
		}
}


	public static void main(String[]args) {
		int factorialnumber = fact(10);
		System.out.println("factorial of 10 is " + factorialnumber);
	}
}