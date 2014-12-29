import java.util.Scanner;


class hanoitowers {

public static Integer hanoimoves (Integer Num) {
		if (Num <= 2) {
				return 3;
	} else {
			Integer result = hanoimoves (Num-1) * 2 + 1;
			return result;
}
}

public static void main (String [] args) {
	System.out.println("This app calculates how many moves it will take to solve the problem with N discs");
	System.out.println("Enter the number of dicscs: ");
	Scanner sc = new Scanner(System.in);
	     int i = sc.nextInt();

	Integer mynum = hanoimoves(i);
	System.out.println("The number of moves is: " + mynum);
}


}