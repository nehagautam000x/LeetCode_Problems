// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/

// 2535. Difference Between Element Sum and Digit Sum of an Array


class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++)
        {
            eleSum+=nums[i];
            int n=nums[i];
            while(n>0)
            {
                digitSum+=n%10;
                n=n/10;
            }
        }
        return Math.abs(eleSum-digitSum);
    }
}