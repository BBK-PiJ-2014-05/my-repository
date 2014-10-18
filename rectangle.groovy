class Point {
double x;
double y;
}
class Rectangle {
Point uppleft;
Point downright;
}

print "Enter x of point 1: "
String strx = System.console().readLine()
print "Enter y of point 1: "
String stry = System.console().readLine()

Point pt1 = new Point()
pt1.x = Double.parseDouble(strx)
pt1.y = Double.parseDouble(stry)

print "Enter x of point 2: "
strx = System.console().readLine()
print "Enter y of point 2: "
stry = System.console().readLine()

Point pt2 = new Point()
pt2.x = Double.parseDouble(strx)
pt2.y = Double.parseDouble(stry)

Rectangle r1 = new Rectangle()
r1.uppleft = pt1
r1.downright = pt2

double area = (pt2.x - pt1.x) * (pt2.y - pt1.y)

println "area is: " + area