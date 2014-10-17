println "This finds the closest prime"
String str = System.console().readLine()
int x = Integer.parseInt(str)
int lstep = 0
int hstep = 0
int c = 1
int n = 1
int primetest = 0
boolean finished = false
while (!finished) {
	while (c <= x) {
		if (x%c == 0) {
			primetest++
			c++
		}}
	if (primetest == 2) {
		printline "This is prime"
		finished = true
		c = 1
	}
	else { x = x - n
		n++
	}	  	

}
print x