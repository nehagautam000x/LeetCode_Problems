// https://leetcode.com/problems/left-and-right-sum-differences/description/

// 2574. Left and Right Sum Differences


class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length-1] = 0;
        int sum = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum=sum+nums[i];
            leftSum[i+1] = sum;
            
        }
        sum=0;
        for(int i=nums.length-1;i>0;i--)
        {
            sum=sum+nums[i];
            rightSum[i-1] = sum;
            
        }
        for(int i=0;i<nums.length;i++)
        {
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}