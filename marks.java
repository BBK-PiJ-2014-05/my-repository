public class Marks {

public static void main(String[]args) {

int mark = 0;
int total = -1;
int dist = 0;
int pass = -1;
int fail = 0;
int invalid = 0;

	System.out.println("Enter some marks between 0 and 100; finish with -1");
	do {
	String str = System.console().readLine();
	mark = Integer.parseInt(str);
	if (mark < -1 || mark > 100) {
			invalid++;

		}
	else if (mark < 50 && mark > -1) {
			fail++;
			total++;
		}
	else if (mark < 71) {
		pass++;
		total++;
	}
	else if (mark <= 100) {
			dist++;
			total++;
		}
	}
	while (mark != -1);

	System.out.println("There are " + total + " students: " + dist + " distinctions, " + pass + " passes, " + fail + " fails (" + invalid + " invalid).");

}
}


