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
	Integer mynum = hanoimoves(6);
	System.out.println("The number of moves is " + mynum);
}


}