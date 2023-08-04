// https://leetcode.com/problems/sort-array-by-parity-ii/description/

// 922. Sort Array By Parity II


class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int[] arr = new int[nums.length];
       int j=0,k=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]%2==0)
           {
               arr[2*k]=nums[i];
               k++;
           }
           else{
               arr[2*j+1]=nums[i];
               j++;
           }
       } 
       return arr;
    }
}


// Method-2
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int j=0;
        int k=1;
        int[] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]%2==0)
            {
                ans[j]=nums[i];
                j+=2;
            }else
            {
                ans[k]=nums[i];
                k+=2;
            }
        }
        return ans;
    }
}