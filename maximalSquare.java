// Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
class Solution {
    public int maximalSquare(char[][] matrix) {
        //make a new int array for row and column
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans = 0;
        //loop through row
        for(int i = 0; i < matrix.length; i++){
            //loop through column
            for(int j = 0; j < matrix[0].length; j ++){
                //check to see if this index has a 1 otherwise move to the next
                if(matrix[i][j] == '1'){
                    //if it starts at any sort of row or column then we know it will be 1
                    if(i == 0|| j == 0){
                        dp[i][j] = 1;
                    }
                    //check the left above and to the right
                    else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                    }
                    //update the answer 
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        //square it
        return ans * ans;
    }
}
