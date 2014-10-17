println "Enter a math function:"
String str = System.console().readLine()
int n = 0
double result = 0
double first = 0
double last = 0
boolean finished = false
while (!finished) {
    char operator = str.charAt(n)
    if (operator=='/' || operator=='*' || operator=='+' || operator=='-') {   
        finished = true 
    }
    else  { n++ 
    }
}
operator = str.charAt(n)
String str1 = str.substring(0,n)
first = Double.parseDouble(str1)
String str2 = str.substring(n+1)
last = Double.parseDouble(str2)

switch (operator) {
case '/':
result = first / last
println "Answer: " + result
break;
case '*':
result = first * last
println "Answer: " + result
break;
case '+':
result = first + last
println "Answer: " + result
break;
case '-':
result = first - last
println "Answer: " + result
default:
print "Error"
break;
}
