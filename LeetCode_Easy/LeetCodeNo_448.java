// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

// 448. Find All Numbers Disappeared in an Array    ------> Asked in Google

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex])
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
            if(nums[j]!=j+1)
            {
                list.add(j+1);
            }
        }
        return list;
    }
}

