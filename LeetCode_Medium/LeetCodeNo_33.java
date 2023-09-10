// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

// 33. Search in Rotated Sorted Array

// Method-1
class Solution {
    public int search(int[] nums, int target) {
        int res = rotated(nums);
        int ans = searchRotated(nums,0,res-1,target);
        if(ans==-1)
        {
            return searchRotated(nums,res,nums.length-1,target);
        }
        else{
            return ans;
        }
    }
     public static int rotated(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            int prev = (mid + arr.length-1)%arr.length;
            int next = (mid+1)%arr.length;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
                return mid;
            else if(arr[start]<=arr[mid] && arr[mid]>arr[end])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static int searchRotated(int[] arr, int start, int end, int target)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(target>arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}


// Method-2
class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot==-1)
        {
            return BS(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>=nums[0])
        {
            return BS(nums,target,0,pivot-1);
        }
        return BS(nums,target,pivot+1,nums.length-1);
    }
    static int BS(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr)
    {
        int start =0;
        int end =arr.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
