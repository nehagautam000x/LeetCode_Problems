// https://leetcode.com/problems/missing-number/description/

// 268. Missing Number     -----> Asked in Amazon 

class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex = nums[i];
            if( nums[i]<nums.length && nums[i]!=nums[correctIndex] )
            {
                int temp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j)
            {
                 return j;
            }
        }
        return nums.length;
    }
}