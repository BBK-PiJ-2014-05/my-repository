println "Try to guess my number!"
int numberToGuess = Math.abs(1000 * Math.random())
int c = 0
boolean finished = false

while (!finished) {
	println "Enter a number: "
	String str = System.console().readLine()
	int trythis = Integer.parseInt(str)
	if (trythis > numberToGuess) {
		println "My number is lower"
	}
	else if (trythis < numberToGuess) {
		println "My number is higher"
	}
	else if (trythis == numberToGuess) {
		println "You got it!"
		finished = true
	}
c = c +1
}

println "It took only " + c + " guesses!"