// 442. Find All Duplicates in an Array

//  https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

// Trick :- For [1-n]
//                 -----> index=value-1
//         For [0-n]
//                 -----> index=value


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        if( nums.length==1)
            return list;
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
                list.add(nums[j]);
            }
        }
        return list;
    }
}