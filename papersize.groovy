int paperLength(int n) {
   int paperlen
   if (n == 0) {
       paperlen = 1189
   } else if (n < 0) {
       paperlen = 2 * paperWidth(n+1)
   } else if (n > 0) {
       paperlen = paperWidth(n-1)
   }
   return paperlen
}
   
int paperWidth(int n) {
    int paperwid
    if (n == 0) {
        paperwid = 841
    } else if (n < 0) {
        paperwid = paperLength(n+1)
    } else if (n > 0) {
        paperwid = 0.5 * paperLength(n-1)
    }
    return paperwid
}
   
print "Enter a papersize- e.g. 'A1', 'A4' or 'A000':>"   
String str = System.console().readLine()

int len = str.substring(1).length()
int papersz = 0
if (len == 1) {
    papersz = Integer.parseInt(str.substring(1))
} else {
    papersz = (len -1) * -1
}
    
int x = paperLength(papersz)
int y = paperWidth(papersz)

println "The paper width of papersize " + str + " is " + y + "mm."
println "And the paper length of papersize " + str + " is " + x + "mm."
 
               
               
           