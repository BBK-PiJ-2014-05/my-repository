print "Enter some words: "
String str = System.console().readLine()
print "Now enter a letter: "
String let = System.console().readLine()
char letter = let.charAt(0)
int len = str.length()
int x = 0
int e = 0
while ( x <= len-1) {
    char y = str.charAt(x)
    if (y == letter) {
        e++
        }
        x++
}
println "The letter \"" + letter + "\" shows up " + e + " times."