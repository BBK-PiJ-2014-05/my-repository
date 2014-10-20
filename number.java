class number
{
	 number()
	 {}

	 int Subtract(int xxx, int yyy)
	 {
	 	return (xxx - yyy);
	 }

	 public static void main(String[] args)
	 {
		int m = 8;
		int n = 9;

		number myNum = new number();
		System.out.println(myNum.Subtract(m,n));
		System.out.println(myNum.Subtract(n,m));
	 }
}