double result = 0
println "Enter 2 numbers, after each hit return"
String str = System.console().readLine()
double num1 = Double.parseDouble(str)
str = System.console().readLine()
double num2 = Double.parseDouble(str)
println "Now, enter 1 for add, 2 for subtract, 3 for multiply and 4 for divide"
str = System.console().readLine()
int choice = Integer.parseInt(str)

switch (choice) {
case 1:
    result = num1 + num2
    print "Addition: " + result
    break;
case 2:
    result = num1 - num2
    print "Subtraction: " + result
    break;
case 3:
    result = num1 * num2
    print "Multiplication: " + result
    break;
case 4:
    result = num1 / num2
    print "Division: " + result
    break;
default:
    print "Sorry, not valid selection"
    break;
}      