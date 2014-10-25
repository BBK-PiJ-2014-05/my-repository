class Mortcase {
    double amount
    double loanterm
    double rate
    double monthamount
    double totalamount

    int interestpaidby() {
        return (totalamount - amount) / monthamount
    }
}
void monthlyamount (Mortcase mymortgage) {
    mymortgage.monthamount =  mymortgage.rate/12 * mymortgage.amount/(1-Math.pow((1+mymortgage.rate/12),-mymortgage.loanterm*12))
}

void totalpaid (Mortcase mymortgage) {
    mymortgage.totalamount = mymortgage.monthamount * mymortgage.loanterm * 12    
}

  
Mortcase mycase = new Mortcase();
print "Enter the amount you wish to borrow: >"
String str =  System.console().readLine();
mycase.amount = Double.parseDouble(str);

print "Enter the loan term in years: >"
str =  System.console().readLine()
mycase.loanterm = Double.parseDouble(str)

mycase.totalamount = 0;
print "Enter the interest rate (per annum): >"
str = System.console().readLine()
mycase.rate= Double.parseDouble(str)
monthlyamount(mycase)
totalpaid(mycase)
println "The monthly amount is " + mycase.monthamount
println "The total you'll pay is " + mycase.totalamount
println "The interest will be paid by month " + mycase.interestpaidby()



   