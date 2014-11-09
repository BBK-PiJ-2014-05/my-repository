

class Matrix {
int [][] x;

	Matrix(int x, int y) {
		this.x = new int [x][y];
		for (int i = 0; i < x; i++ ) {
			for (int j = 0; j < y; j++) {
				this.x[i][j] = 1;
		}
			}


	}
	public void SetElement(int x, int y, int z) {
		if (x > this.x.length || y > this.x[0].length) {
			System.out.println("Out of Bounds!");
		} else {
			this.x[x][y] = z;
		}
	}

	public boolean stringIsValid(String s) {
			boolean result = true;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (!Character.isDigit(c)) {
					result = false;
				}
			}
			return result;
	}

	public void SetRow(int x, String s) {

		if (stringIsValid(s)==true) {
			if (s.length() == this.x.length && x < this.x.length) {
				int string2int = Integer.parseInt(s);
				for (int i = 0; i < this.x.length; i++) {
					int digit = string2int%10;
					string2int = string2int/10;
					this.x[x][this.x.length-i-1] = digit;
				}
			}

		}
	}

	public void SetColumn(int x, String s) {
		if (stringIsValid(s) == true) {
			if (s.length() == this.x[0].length && x < this.x[0].length) {
				int string2int = Integer.parseInt(s);
				for (int i = 0; i < this.x[0].length; i++) {
					int digit = string2int%10;
					string2int = string2int/10;
					this.x[this.x.length-i-1][x] = digit;
				}
			}
		}
	}




	public void toString1() {
		String s = "{[";
		for (int i = 0; i < this.x.length; i++) {
			if (i > 0) {
				s = s + "][";
			}
				for (int j = 0; j < this.x[0].length; j++) {
					s = s + Integer.toString(this.x[i][j]);
					if (j < this.x[0].length - 1) {
						s = s + ",";
					}
				}

		}
		s = s + "]}";
		System.out.println(s);
	}

	public void prettyPrint() {
		for (int i = 0; i < this.x.length; i++) {
				if (i > 0) {
					System.out.println("");
				}
				for (int j = 0; j < this.x[0].length; j++) {
					System.out.print(this.x[i][j] + "\t");
				}
		}
	}

	public static void main(String[]args) {
		Matrix mymatrix = new Matrix(8,8);
		mymatrix.SetElement(2,2,2);
		String str = "99999999";
		mymatrix.SetRow(1,str);
		mymatrix.SetColumn(0,str);
		mymatrix.toString1();
		mymatrix.prettyPrint();
	}

}