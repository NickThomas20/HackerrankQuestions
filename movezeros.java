class Solution {
    public void moveZeroes(int[] nums) {
      
       int L = 0;
       int R = 1;

       while(R < nums.length){
           //check to see if we have to move it over or not
           if(nums[L] != 0){
               R++;
               L++;
            // check if rights 0 so you can continue to go 
           }else if (nums[R] == 0){
               R++;
            // if not make the swap 
           }else{
               int temp = nums[R];
               nums[R] = nums[L];
               nums[L] = temp;
           }
       }

      System.out.println(nums);
    }
}
