print "Enter a number with , and .:"
String str = System.console().readLine()

c = 0
String digit = ""
int len = str.length()
while (c <= len-1) {
       String char1 = str.substring(c,c+1)
       if (char1 == "," || char1 == ".") { 
       }
       else { digit = digit + char1 
       }
       c++
}
int num = Integer.parseInt(digit)
double num1 = num
num1 = num/2
num1 = num1/100
println num1