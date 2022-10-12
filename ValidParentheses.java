// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// 1.Open brackets must be closed by the same type of brackets.
// 2.Open brackets must be closed in the correct order.
// 3.Every close bracket has a corresponding open bracket of the same type.
class Solution {
    public boolean isValid(String s) {
        //O(n) run time
       Stack<Character> stack = new Stack<Character>();
        //check to see if string is even 
        if(s.length() % 2 != 0){
            return false;
        }
        //loop through string for any parentheses
        for(char c : s.toCharArray()){
            // push all opening parentheses 
           if(c == '(' || c == '{'|| c== '['){
               stack.push(c);
        //all of these conditionals just check for matching parentheses and then pop if true
           }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
               stack.pop();
           }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
               stack.pop();
           }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
               stack.pop();
           }else{
                return false;
            }
    }
        return stack.isEmpty();
    }
}
