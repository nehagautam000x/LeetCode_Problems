// https://leetcode.com/problems/third-maximum-number/description/

// 414. Third Maximum Number

// Method-1
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]))
            {
                list.add(nums[i]);
            }
        }
        return (list.size()<=2)?list.get(list.size() - 1):list.get(list.size() - 3);
    }
}

// Method-2
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for (int i=nums.length-1;i>=0;i--)
        {
            if (i!=nums.length-1 && nums[i]==nums[i+1])
            {
                continue;
                
            }else if (count==3)
            {
                return nums[i];
            }
            else
            {
                count++;
            }
        }
        return nums[nums.length-1];
    }
}

// Method-3
class Solution {
    public int thirdMax(int[] nums) {
        long m1=Long.MIN_VALUE;
        long m2=Long.MIN_VALUE;
        long m3=Long.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>m1)
             m1=nums[i];
            else if(m1>nums[i] && nums[i]>m2)
             m2=nums[i];
            else if(m2>nums[i] && nums[i]>m3)
             m3=nums[i];
        }
        return (m3==Long.MIN_VALUE ? (int)m1 :(int) m3);
    }
}