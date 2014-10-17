println "Enter some text and I'll detect if it's a palindrome"
String str = System.console().readLine()
len = str.length()
int c = 0
boolean palindrome = true
String str2 = ""
while (c <= len-1) {
    char char1 = str.charAt(c)
        if (char1.isLetter()) {
            str2 = str2 + str.substring(c,c+1)
        }
        
        c++
}
int len2 = str2.length()
c = 0
while (c <= len2/2) {
    char1 = str2.charAt(c)
    char char3 = char1.toLowerCase()
    char char2 = str2.charAt(len2-1-c)
    char char4 = char2.toLowerCase() 
    if (char3 == char4) {
    }
    else {
    palindrome = false 
    }
    c++
    }   
if (palindrome == true) {
    print "This text is a palindrome"
    }
else { print "This is not a palindrome" 
}
