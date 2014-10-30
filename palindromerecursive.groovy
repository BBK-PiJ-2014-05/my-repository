boolean palindromeTester(String str, int n, int i) {
   
    boolean result = false
    if ( n == 1) {
          result = true
    } else {
          char c1 = str.charAt(n)
          char c2 = str.charAt(i-n)
          if (c1 == c2) {
          
            palindromeTester(str, n-1,i)
          
          } else { 
              result = false 
              return result
          }
   }
}
   

print"Enter some text to determine palindrome:"
String mystring = System.console().readLine()
int num = mystring.length() - 1

boolean testr = palindromeTester(mystring,num,num)
print testr
