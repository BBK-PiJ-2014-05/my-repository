boolean finished = false
println "Enter a number to get the nearest prime number: "
String str = System.console().readLine()
int x = Integer.parseInt(str)
int n = 1 
int c = 1
int primetst = 0
while (!finished) {
	while (c <= (x-n)) {
		if ((x-n)%c == 0) {
			primetst++
		}
		c++
	}
	if (primetst == 2) {
		finished = true
	}
	else {
		n++ 
		c= 1
		primetst = 0
	}
//println "x-n " + (x - n)
//println "primetst " + primetst
//println "c " + c
}
finished = false
int m = 1
c = 1
primetst = 0
while (!finished) {
	while (c <= (x+m)) {
		if ((x+m)%c == 0) {
			primetst++
		}
		c++
	}
	if (primetst == 2) {
		finished = true
	}
	else {
		m++ 
		c= 1
		primetst = 0
	}
//println "m " + m
//println "primetst " + primetst
//println "c " + c
}
if (m > n) {
	println "The nearest prime number to " + x + " is: " + (x - n)
}
if (m < n) {
	println "The nearest prime number to " + x + " is: " + (x + m)
}
else if (m == n) {
	println "There are two prime numbers equally as close to " + x + ". These are: " + (x-n) + " and: " + (x+m) 
}