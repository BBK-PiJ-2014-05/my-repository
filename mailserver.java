public class mailserver {
	public static void main(String[] args){

System.out.println("WOW! Email Server 1.0");

//MAIL FROM:geoff777@gmail.com --length=28; beginemail=from pos 10

boolean quit = false;
boolean cmdcheck = false;
char atsign;
while (!quit) {
    while (!cmdcheck) {
        System.out.print(">>> ");
        String cmd = System.console().readLine();
        int len = cmd.length();
        int x = 0;
        int c = 0;
        if (cmd.substring(0,10) == "MAIL FROM:") {
            while (x <= len - 11) {
                atsign = cmd.charAt(10 + x);
                if (atsign == '@') {
                    c++;
                }
                    x++;

				if (c == 1) {
						atsign = cmd.charAt(10);
							if (atsign != '@') {
								atsign = cmd.charAt(len-1);
									if (atsign != '@') {
										cmdcheck = true;
									}
								}
							}
				}
			}
