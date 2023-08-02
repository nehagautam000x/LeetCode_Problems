// https://leetcode.com/problems/first-missing-positive/

// 41. First Missing Positive    ---> Asked in Amazon

class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int currentIndex = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[currentIndex])
            {
                int temp = nums[i];
                nums[i]=nums[currentIndex];
                nums[currentIndex]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return j+1;
            }
        }
        return nums.length+1;
    }
}


