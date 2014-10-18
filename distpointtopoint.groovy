class Point {
    double x;
    double y;
}

print "Enter x for pt1: "
String strx = System.console().readLine()
print "Enter y for pt1: "
String stry = System.console().readLine() 

Point pt1 = new Point()
pt1.x = Double.parseDouble(strx)
pt1.y = Double.parseDouble(stry)

print "Enter x for pt2: "
strx = System.console().readLine()
print "Enter y for pt2: "
stry = System.console().readLine()

Point pt2 = new Point()
pt2.x = Double.parseDouble(strx)
pt2.y = Double.parseDouble(stry)

print "Enter x for pt3: "
strx = System.console().readLine()
print "Enter y for pt3: "
stry = System.console().readLine()

Point pt3 = new Point()
pt3.x = Double.parseDouble(strx)
pt3.y = Double.parseDouble(stry)

double ab = ((pt1.x - pt2.x)**2 - (pt1.y - pt2.y)**2)**0.5
double ac = ((pt1.x - pt3.x)**2 - (pt1.y - pt3.y)**2)**0.5
double bc = ((pt2.x - pt3.x)**2 - (pt2.y - pt3.y)**2)**0.5



if (ab == ac && ab == bc) {
    print "All the same"
    }
else if (ab == ac && ab < bc) {
    print "pt 1 and pt2 are the same as pt1 and pt3" 
    }
else if (ac == bc && ac < ac) {
    print "pt1 and pt3 are the same as pt2 and pt3"
    }
else if (ab == bc && ab < ac) {
    print "pt1 and pt2 are the same as pt2 and pt 3"
    } 
else if (ab < ac && ab < bc) {
    print "pt1 & pt2"
    }
else if (ac < ab && ac < bc) {
    print "pt1 and pt3"
    }
else if (bc < ac && bc < ab) {
    print "pt2 and pt3"
    }
println "ab" + ab
prntln "ac" + ac
println "bc" + bc


