// https://leetcode.com/problems/sort-array-by-parity/description/

// 905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int[] arr = new int[nums.length];
      int j=0;
      int k=0;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]%2==0)
          {
              arr[j++]=nums[i];
          }
          else{
              arr[nums.length-1-k]=nums[i];
              k++;
          }
      }
      return arr;
    }
}

// Method-2
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for (int i=0;i<nums.length-1;i++)
        {
            for (int j=i+1;j>0;j--)
            {
                if (nums[j-1]%2!=0)
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;
        
    }
}