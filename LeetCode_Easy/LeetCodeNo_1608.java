// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/

// 1608. Special Array With X Elements Greater Than or Equal X

class Solution {
    public int specialArray(int[] nums) {
        for(int i=1;i<=nums.length;i++)
        {
            int count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]>=i)
                {
                    count++;
                }
            }
            if(i==count)
            {
                return i;
            }
        }
        return -1;
    }
}