println "Type in some words: "
String str = System.console().readLine()
int len = str.length()
int x = 0
int first = 0
int last = 0
while (x <= len-1) {
    char y = str.charAt(x)
    if (y == ' ') {
        println str.substring(first,x)
        first = x+1
        }
    x++


}
println str.substring(first,len)    