// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

// 153. Find Minimum in Rotated Sorted Array


class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            int prev = (mid + nums.length -1)%nums.length;
            int next = (mid + 1) % nums.length;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next])
                return nums[mid];
            else if(nums[start]<=nums[mid] && nums[mid] > nums[end])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}