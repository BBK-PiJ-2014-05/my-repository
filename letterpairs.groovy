println "Enter a pair of letters: "
String str1 = System.console().readLine()
println "Now enter some words: "
String str2 = System.console().readLine()
int len = str2.length()
char c1 = str1.charAt(0)
char c2 = str1.charAt(1)
int x = 0
int c = 0

while (x <= len-2) {
        char s1 = str2.charAt(x)
        char s2 = str2.charAt(x+1)

    if (s1 == c1 && s2 == c2) {
        c++
        }
        x++
}
println "the short string appears " + c + " times."    
  