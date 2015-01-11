public class MobilePhone extends OldPhone {

	private ArrayStringStack callHistory = new ArrayStringStack();

	public void ringAlarm(String sound) {
		System.out.println("Ringing alarm sound " + sound);
	}

	public void playGame(String game) {
		System.out.println("Starting game " + game);
	}

	@Override
	public void call(String number) {
		super.call(number);
		callHistory.push(number);
	}

	public void printLastNumbers() {
		int max =0;
		int headIndex = callHistory.getSize() -1;
		if (callHistory.getSize() > 10) {
			max = 10;
		} else {
			max = callHistory.getSize();
		}
			System.out.println("Call History: ");
			for (int i = 0; i < max; i++) {
				System.out.println(" " + callHistory.getElement(headIndex-i));
			}


	}

}
