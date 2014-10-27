println "WOW! Email Server 1.0"

//MAIL FROM:geoff777@gmail.com --length=28; beginemail=from pos 10

boolean quit = false
boolean errorcheck = false
char atsign
while (!quit) {
    while (!errorcheck) {
        print ">>> "
        String str = System.console().readLine()
        if (str == "QUIT") {
            quit = true
        }
       
        if (str.substring(0,10) != "MAIL FROM:") {
            errorcheck = true
            println "Error"
        }  
        int len = str.length()
        int c = 0
        int x = 0
        while (x < len) {
            atsign = str.charAt(x)
            if (atsign == '@') {
                c++
            }
            x++
        }
        if (c != 1) {
            errorcheck = true
        }
        atsign = str.charAt(10)
        if (atsign == '@') {
            errorcheck = true
        }
        atsign = str.charAt(len-1)
        if (atsign == '@') {
            errorcheck = true
            
        }
      
    }    



print "OK"


}                          