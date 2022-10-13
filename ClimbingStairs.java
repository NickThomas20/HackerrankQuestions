// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


class Solution {
    public int climbStairs(int n) {
      //NOT RECURSIVE o(n)
        //curr step
         int a = 1
        //next step
         int b = 1;
        while (n-- > 0){
        a = (b += a) - a;
        }
    return a;
        
    }
}

class Solution2 {
    public int climbStairs(int n) {
        //RECURSIVE
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
        }  
    }
}
