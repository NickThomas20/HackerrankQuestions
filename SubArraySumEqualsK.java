// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array
class Solution {
    public int subarraySum(int[] nums, int k) {
        //O(n^2)
        //count each subarray
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            //add up the sum until it equals k
            int sum = 0;
            //iterate through each index starting from i
            for(int j = i; j < nums.length; j++){
                //add to sum
                sum += nums[j];
                //if sum hits target k then count
                if( sum == k){
                    count++;
                }
            }
            sum = 0;
        }
        return count;
        
    }
}
