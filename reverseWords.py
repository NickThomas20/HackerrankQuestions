class Solution:
    def reverseWords(self, s: str) -> str:
        #make string so it is trimmed and only one space
        cleaned_up = ' '.join(s.split()).strip()
        #split into a list after each space
        words = cleaned_up.split(' ')
        reverse_word = words[::-1]
        #join back together with spacing
        soln = ' '.join(reverse_word)
        return soln
