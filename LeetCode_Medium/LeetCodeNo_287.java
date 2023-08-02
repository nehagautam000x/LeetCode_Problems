// https://leetcode.com/problems/find-the-duplicate-number/

// 287. Find the Duplicate Number   -------> Asked in "Amazon & Microsoft"

class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex = nums[i];
            if(nums[i]!=nums[correctIndex])
            {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
       return nums[0];
    }
}