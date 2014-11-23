/**
 * Created by keith for the second coursework assignment.
 */
public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
        new Fraction(1, 0);
        // test multiply
	Fraction f = new Fraction(3,10);
	Fraction g = new Fraction(1,2);
	Fraction h = new Fraction(3,5);
	Fraction i = new Fraction(1,4);
	Fraction j = new Fraction(3,4);
	if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
        // test equals
	if (!j.equals(g.add(i))) System.out.println("Add failed");
	if (!i.equals(j.subtract(g))) System.out.println("Subtract failed");
	if (!g.equals(i.divide(g))) System.out.println("Divide failed");
	test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
	test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
	test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
	test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
	test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");
	testabsolute(new Fraction(1,2),new Fraction(1,2),"error test 6");
	testabsolute(new Fraction(-1,2),new Fraction(1,2),"error test 7");
	testnegate(new Fraction(-1,2),new Fraction(1,2),"error test 8");
	testnegate(new Fraction(1,2), new Fraction(1,2),"error test 9");

    }

    static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
    static void testabsolute(Fraction f1, Fraction f2, String msg) {
		if (! f1.absolute().equals(f2))
		System.out.println(msg);
	}
	static void testnegate(Fraction f1, Fraction f2, String msg) {
		if (! f1.negate().equals(f2))
		System.out.println(msg);
	}
}
