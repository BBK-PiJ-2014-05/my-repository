import java.util.Scanner;

public class FractionCalculatorTest {


public static Fraction evaluate(Fraction fraction, String str) {

	char c;
	int num = 1;
	int denom = 1;
	String operator = "";
	Fraction newresult = new Fraction(1,1);

	String[] data = str.split(" "); 			// split string into array parts to determine the fraction and the operator.
	for (int i = 0; i < data.length; i++) {
		if (data[i].length() < 3) { 			// could be a negative integer, not a fraction.
			for (int j = 0; j < data[i].length(); j++) {
				c = data[i].charAt(j);
				if (Character.isDigit(c)) {
					num = Integer.parseInt(data[i]);
					//System.out.println("numer is" + num);
				}
				if (c == '+') {					// determine the operator.
					operator = "addition";
				} else if (c == '*') {
						operator = "multiply";
					} else if (c == '/') {
							operator = "divide";
						} else if (c == '-') {
								operator = "subtract";
							}
			}

		} else {								// 3 or more characters assumed to be a fraction.
			for (int j = 0; j < data[i].length(); j++) {
				c = data[i].charAt(j);
				if (c == '/') {
					num = Integer.parseInt(data[i].substring(0,j));
					denom = Integer.parseInt(data[i].substring(j+1));
					//System.out.println("num this time" + num);
					//System.out.println("denom this time" + denom);

				}
			}
		}
	}

	Fraction fraction2 = new Fraction(num,denom);
	//System.out.println("fraction two is" + fraction2);

	if (operator.equals("addition")) {
		newresult = fraction.add(fraction2);
	}
	if (operator.equals("subtract")) {
		newresult = fraction.subtract(fraction2);
	}
	if (operator.equals("divide")) {
		newresult = fraction.divide(fraction2);
	}
	if (operator.equals("multiply")) {
		newresult = fraction.multiply(fraction2);
	}

	return newresult;
}

public static void main(String[] args) {


	int num = 1;
	int denom = 1;
	boolean finished = false;
	boolean negateval = false;
	boolean absoluteval = false;
	Fraction newresult = new Fraction(num,denom);

	System.out.println("Geoff's simple fraction calculator (limited features).");
	while (!finished) {

		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] inputstring = s.split(" ");
												//if not a fraction then could be an int (0-9 (allowing for negative)), 'q' or 'c'.
		if (inputstring[0].length() < 3) {
			if (inputstring[0].equals("q")) {
				System.out.println("Goodbye!");
				finished = true;

			}
			if (inputstring[0].equals("n")) {   // negate stored value.
				negateval = true;
					num = newresult.getNumerator();
					denom = newresult.getDenominator();
					System.out.println("num now is" + num + "denom now is" + denom);
			}
			if (inputstring[0].equals("a")) { 	// absolute value
				absoluteval = true;
			}
			if (inputstring[0].equals("c")) {	// clear calculator
				num = 1;
				denom = 1;
			}
			else {       						//value stored becomes the first operand.
					num = newresult.getNumerator();
					denom =	newresult.getDenominator();
			}
		}
												// a fraction has > 2 character length; get num & denom.
		else {
			for (int j = 0; j < inputstring[0].length(); j++) {
				char c = inputstring[0].charAt(j);
				if (c == '/') {
					num = Integer.parseInt(inputstring[0].substring(0,j));
					denom = Integer.parseInt(inputstring[0].substring(j+1));
					s = s.substring(inputstring[0].length()+1);
				}
			}
		}

		Fraction result = new Fraction(num,denom);
		if (negateval == true) {
			newresult = result.negate();
			System.out.println("line 120" + newresult);
		}
		if (absoluteval == true) {
			newresult = result.absolute();
		}
		else {
		newresult = evaluate(result,s);
		}
		System.out.println(newresult);


	}

}
}
