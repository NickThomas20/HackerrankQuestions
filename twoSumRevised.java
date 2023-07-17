//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int remainder = target - nums[i];
            //if its in hashmap then return values 
            if(map.containsKey(remainder)){
                return new int[]{map.get(remainder), i};
            }
            //otherwise add to hashmap
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
