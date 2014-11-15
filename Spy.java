public class Spy {
	private static int Spycount = 0;
	private int spyid = 0;
	Spy(int spyid) {
		this.spyid = spyid;
		Spycount ++;
		System.out.println("Spy number " + spyid + " has been created!");
		System.out.println("Total number of spies now is " + Spycount);
	}
	public void die(int spyid) {
		Spycount--;
		System.out.println("Spy number " + spyid + " has been eliminated!");
		System.out.println("Total number of spies now is " + Spycount);
	}
	public static void main(String[] args) {
		Spy spy1 = new Spy(1);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		spy1.die(1);
	}
}
