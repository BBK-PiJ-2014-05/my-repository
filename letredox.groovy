print "Enter some words: "
String str = System.console().readLine()
int strlen = str.length()
boolean finished = false
String teststring = " "
while (!finished) {
    print "Enter a letter: "
    String str1 = System.console().readLine()
    teststring = teststring + str1
    int teststringlen = teststring.length()
    int c = 0
    int inst = 0
    char x = teststring.charAt(teststringlen-1)
    while (c <= teststringlen-1) {
        char tst = teststring.charAt(c)
        if (tst == x) {
        inst++
        }
        c++
        }
        if (inst > 1) {
            finished = true
            println "You already entered \""+ str1+"\". Goodbye!"
        }
        int p = 0
        int countr = 0
       
        while (p <= strlen-1) {
            char tst2 = str.charAt(p)
            if (tst2 == x) {
            countr++
            }
            p++
            }
        println "The letter \"" + str1 + "\" appears " + countr + " times."

}

     

