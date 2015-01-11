public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
	SmartPhone smart1 = new SmartPhone("Apple");
	smart1.findPosition();
	smart1.browseWeb("Google.com");
	smart1.playGame("Tetris");
	smart1.ringAlarm("DaisyChains");
	smart1.call("323 456 5674");
	smart1.call("323 456 5675");
	smart1.call("323 456 5676");
	smart1.call("323 456 5677");
	smart1.call("323 456 5678");
	smart1.call("323 456 5679");
	smart1.call("323 456 5610");
	smart1.call("323 456 5611");
	smart1.call("323 456 5612");
	smart1.call("323 456 5613");
	smart1.call("323 456 5614");
	smart1.call("001 456 5615");
	smart1.printLastNumbers();
	System.out.println("smartphone brand: " + smart1.getBrand());
	}



}