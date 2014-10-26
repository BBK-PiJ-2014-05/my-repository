class Point {
String binarystring;
int totaldecimal;
}

void binary2decimal(Point point) {
    for (int i = 0; i < point.binarystring.length(); i++) {
        char c = point.binarystring.charAt(i)
        if (c == '1') {
            int bitcalc = 1 * Math.pow(2,point.binarystring.length()-i-1)
            point.totaldecimal += bitcalc
        }     
    }
}

void decimal2binary(Point point) {
    int dec = point.totaldecimal
    String bitpoint = ""
    while (dec != 0) {
       
        if (dec%2 != 0) {
            bitpoint = 1
        } else if (dec%2 == 0) {
            bitpoint = 0
        }
     dec = dec /2
    point.binarystring = bitpoint + point.binarystring
    }
}

println "Binary to Decimal and Vice Versa\n"
println "Enter a binary number and get the decimal equivalent -- Enter 1"
println "Enter a decimal number and get the binary equivalent -- Enter 2"
String str = System.console().readLine()
int choice = Integer.parseInt(str)
switch (choice) {

case 1:

print "Enter a binary number: >"
str = System.console().readLine()
Point mypoint = new Point()
mypoint.binarystring = str
mypoint.totaldecimal = 0
binary2decimal(mypoint)
print "The binary number " + mypoint.binarystring + " is equivalent to " + mypoint.totaldecimal + " expressed as a decimal."
break;

case 2:

print "Enter a decimal number: >"
str = System.console().readLine()
int n = Integer.parseInt(str)
Point mypoint = new Point()
mypoint.totaldecimal = n
decimal2binary(mypoint)
print "The decimal number " + mypoint.totaldecimal + " is equivalent to " + mypoint.binarystring + " expressed as a binary number."
break;

default:
print "error"
break;
}
  




