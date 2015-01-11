public class SmartPhone extends MobilePhone {

	public void browseWeb(String webSite) {
		System.out.println("Browsing website: " + webSite);
	}

	public void findPosition(){
		System.out.println("current position is: NE234 SE2341");
	}

	@Override
	public void call(String number){
		String international = number.substring(0,2);
		if (international.equals("00")) {
			System.out.println("Calling " + number + " over the internet to save money...");
		} else {
			super.call(number);
		}


	}
}