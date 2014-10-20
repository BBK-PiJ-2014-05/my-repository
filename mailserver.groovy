println "WOW! Email Server 1.0"

//MAIL FROM:geoff777@gmail.com --length=28; beginemail=from pos 10

boolean quit = false
boolean cmdcheck = false
while (!quit) {
    while (!cmdcheck) {
        print ">>> "
        String cmd = System.console().readLine()
        int len = cmd.length()
        int x = 0
        int c = 0
        if (cmd.substring(0,10) == "MAIL FROM:") {       
            while (x <= len - 11) {
                char atsign = cmd.charAt(10 + x)
                if (atsign == '@') {
                    c++
                }
                    x++
 
            }
            if (c == 1) {
                cmdcheck = true
            }
            else {
                print "invalid (too many @)"
            }      
            atsign = cmd.charAt(10)
            if (atsign == '@') {
                println "invalid entry, (@at pos 1)"
            }
            else {
                cmdcheck = true
            }
             atsign = cmd.charAt(len-1)
             if (atsign == '@') {
                 println "invalid, @ at last"
            }
            else { cmdcheck = true
            }
            
         }    
     
     }
     quit = true
}           
print "All entries valid"