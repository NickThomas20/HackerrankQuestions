class Solution:
    def reverseVowels(self, s: str) -> str:
        # Convert string to list of characters
        char_s = list(s)
        
        # Set of vowels for quick lookup
        vowels = {'a', 'e', 'i', 'o'}
        
        # Two pointers approach
        i = 0
        j = len(s) - 1
        
        while i < j:
            if char_s[i] in vowels and char_s[j] in vowels:
                # Swap vowels
                char_s[i], char_s[j] = char_s[j], char_s[i]
                i += 1
                j -= 1
            elif char_s[i] in vowels:
                j -= 1
            elif char_s[j] in vowels:
                i += 1
            else:
                i += 1
                j -= 1
        
        # Convert list back to string
        return ''.join(char_s)

        
