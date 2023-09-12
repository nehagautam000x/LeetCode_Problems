// https://leetcode.com/problems/intersection-of-two-arrays/description/

// 349. Intersection of Two Arrays


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        for(int val:nums2){
            if (binarySearch(nums1, val) && !list.contains(val))
                list.add(val);
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static boolean binarySearch(int[] nums1, int val)
    {
        int start = 0;
        int end = nums1.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(val>nums1[mid])
                start = mid+1;
            else if(val<nums1[mid])
                end = mid-1;
            else
                return true;
        }
        return false;
    }
}