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

double area = 0

if (pt1.x >= pt2.x && pt1.y >= pt2.y) {
        Point pt3 = new Point()
        pt3.x = pt2.x
        pt3.y = pt1.y
        Point pt4 = new Point()
        pt4.x = pt1.x
        pt4.y = pt2.y
        Rectangle r1 = new Rectangle()
        r1.uppleft = pt3
        r1.downright = pt4
        area = (pt4.x - pt3.x) * (pt3.y - pt4.y)
        println "Area is: " + area
        println "Perimeter is (upperleft,upperright,lowerright,lowerleft): " + r1.uppleft.x +"," + r1.uppleft.y + "," + r1.downright.x + "," + r1.uppleft.y + "," + r1.downright.x + "," + r1.downright.y + "," + r1.uppleft.x + "," + r1.downright.y
         
        }
        
else if (pt1.x >= pt2.x && pt2.y >= pt1.y) {   
        Rectangle r1 = new Rectangle()
        r1.uppleft = pt2
        r1.downright = pt1
         area = (pt1.x - pt2.x) * (pt2.y - pt1.y)
         println "Area is: " + area
         println "Perimeter is (upperleft,upperright,lowerright,lowerleft): " + r1.uppleft.x +"," + r1.uppleft.y + "," + r1.downright.x + "," + r1.uppleft.y + "," + r1.downright.x + "," + r1.downright.y + "," + r1.uppleft.x + "," + r1.downright.y
        }
else if (pt2.x >= pt1.x && pt1.y >= pt2.y) {
        Rectangle r1 = new Rectangle()
        r1.uppleft = pt1
        r1.downright = pt2
        area = (pt2.x - pt1.x) * (pt1.y - pt2.y) 
         println "Area is: " + area 
         println "Perimeter is (upperleft,upperright,lowerright,lowerleft): " + r1.uppleft.x +"," + r1.uppleft.y + "," + r1.downright.x + "," + r1.uppleft.y + "," + r1.downright.x + "," + r1.downright.y + "," + r1.uppleft.x + "," + r1.downright.y
        }
else    (pt2.x >= pt1.x && pt2.y >= pt1.y) {
        Point pt3 = new Point()
        pt3.x = pt1.x
        pt3.y = pt2.y
        Point pt4 = new Point()
        pt4.x = pt2.x
        pt4.y = pt1.y
        Rectangle r1 = new Rectangle()
        r1.uppleft = pt3
        r1.downright = pt4
        area = (pt4.x - pt3.x) * (pt3.y - pt4.y)
         println "Area is: " + area
         println "Perimeter is (upperleft,upperright,lowerright,lowerleft): " + r1.uppleft.x +"," + r1.uppleft.y + "," + r1.downright.x + "," + r1.uppleft.y + "," + r1.downright.x + "," + r1.downright.y + "," + r1.uppleft.x + "," + r1.downright.y
        }
        
