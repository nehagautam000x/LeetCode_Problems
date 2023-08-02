// 645. Set Mismatch

// https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int currentIndex = nums[i]-1;
            if(nums[i]!=nums[currentIndex])
            {
                int temp = nums[i];
                nums[i] = nums[currentIndex];
                nums[currentIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
}