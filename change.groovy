

println "Enter the sale price: "
String str = System.console().readLine()
double purch = Double.parseDouble(str)
println "Enter the tender amount: "
str = System.console().readLine()
double tender = Double.parseDouble(str)
double diff = tender - purch
double fifty = 0
double twenty = 0
double ten = 0
double five = 0
double two = 0
double one = 0
double fiftyp = 0
double twentyp = 0
double tenp = 0
double fivep = 0
double twop = 0
double onep = 0


while (diff>=50) {
    diff= diff - 50
    fifty++ 
    }
while (diff>=20) {
    diff= diff - 20
    twenty++ 
    }
while (diff>=10) {
    diff= diff - 10
    ten++
    }
while (diff>=5) {
    diff=diff - 5
    five++
    }
while (diff>=2) {
    diff=diff - 2
    two++
    }
while (diff>=1) {
    diff= diff- 1
    one++
    }
while (diff>=0.50) {
    diff=diff - 0.50
    fiftyp++
    }
while (diff>=0.20) {
    diff=diff - 0.20
    twentyp++
    }
while (diff>=0.10) {
    diff=diff - 0.10
    tenp++
    }
while (diff>=0.05) {
    diff=diff - 0.05
    fivep++
    }
while (diff>=0.02) {
    diff=diff - 0.02
    twop++
    }
while (diff>0.00) {
    diff=diff - 0.01
    onep++
    }
    
println "diff:" + diff
println "fifty's:" + fifty
println "twenty's:" + twenty
println "ten's:" + ten
println "five's:" + five
println "two's:" + two
println "one's:" + one
println "50p's:" + fiftyp
println "20p's:" + twentyp
println "10p's:" + tenp
println "5p's:" + fivep
println "2p's:" + twop
println "1p's:" + onep