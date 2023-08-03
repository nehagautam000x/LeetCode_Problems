// https://leetcode.com/problems/majority-element/description/

// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int up = 0;  
        int i=0;
        while(i<nums.length)
        {
            int count=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
                else
                {
                    up=j;
                    break;
                }
            }
            if(count>(nums.length/2))
                return nums[i];
            else
            {
                i=up;   
            }
        }
        return -1;
    }
}

// Method -2

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}