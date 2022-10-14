// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        
        //Testing purpose
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        String s1 = str[str.length - 1];
        System.out.println(s1);
        return s1.length();
    }
}
