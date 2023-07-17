//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
        //check if length same
       if(s.length() != t.length()){
           return false;
       }
       //add to hash map each character 
       for(char i : s.toCharArray()){
           map.put(i, map.getOrDefault(i, 0) + 1);
       }
       //decrement hashmap of each character
       for(char i : t.toCharArray()){
           map.put(i, map.getOrDefault(i, 0) - 1);
       }
        //comapre to see if all are 0
       for(int v : map.values()){
           if(v != 0){
               return false;
           }
       }

       return true;
    }
}
