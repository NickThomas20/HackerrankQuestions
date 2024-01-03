class Solution {
    public int removeDuplicates(int[] nums) {
       int first = 0;
       int second = 1;

       while(second < nums.length){
           //check to see if not dup
           if(nums[first] != nums[second]){
               //increment first up
               first++;
               //swap elements for the new array
               nums[first] = nums[second];
           }
           //increment second
           second++;
       }
       //return size of subearray
       return first + 1;
    }
}
