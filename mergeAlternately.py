
#This is a simple function that allows to alternate between strings and build a new one
#To not go out of range on a given string we set a boundary 
class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        combined = len(word1) + len(word2)
        soln = ""
        for x in range(combined):
            if x < len(word1):
                soln += word1[x]
            if x < len(word2):
                soln += word2[x]
        return soln
        
