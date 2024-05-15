from math import gcd
class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
       #return blank if str's dont match
       if str1 + str2 != str2 + str1:
            return ""
       #grab the gcd of these two strings (numerically)
       soln = gcd(len(str1), len(str2))
       #return the amount of characters given by the num
       return str1[:soln]
            
