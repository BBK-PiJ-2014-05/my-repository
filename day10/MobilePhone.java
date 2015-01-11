public class MobilePhone extends OldPhone {

	private ArrayStringStack callHistory = new ArrayStringStack();

	public void ringAlarm(String sound) {
		System.out.println("Ringing alarm sound " + sound);
	}

	public void playGame(String game) {
		System.out.println("Starting game " + game);
	}

	//@Override
	public void call(String number) {

		super.call(number);
		System.out.println("Works");
		callHistory.push(number);
	}

	public void printLastNumbers() {
		int max;
		if (callHistory.getSize() < 10) {
			max = callHistory.getSize();
		} else {
			max = 10;
		}
			System.out.println("Call History: ");
			for (int i = 10; i > 0; i--) {
				System.out.println(" " + callHistory.getElement(i));
			}


	}

}
