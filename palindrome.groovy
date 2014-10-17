println "Enter a word to test for palindrome:"
String str = System.console().readLine()
int len = str.length()
int c = 1
int s = len/2
String leftbit = ""
String rightbit = ""
while (c <= s) {
    leftbit = leftbit + str.substring(s-c,s-c+1)
    if (len%2 == 0) {
    rightbit = rightbit + str.substring(s-1+c,s+c)
    }
    else {
    rightbit = rightbit + str.substring(s+c,s+c+1)
    }
    c++
}
if (rightbit == leftbit) {
    print "True-- This word is an example of a palindrome"
    }
else { print "False-- This is not a palindrome" }