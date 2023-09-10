// https://leetcode.com/problems/sqrtx/description/

// 69. Sqrt(x)

class Solution {
    public int mySqrt(int x) {
       int start =0;
       int end = x;
       int ans = 1;
       while(start<=end)
       {
           long mid = start + (end-start)/2;
           double val = mid*mid;
           if(val<=x)
           {
               ans = (int)(mid);
                start = (int)(mid+1);
           }
            else
                end = (int)(mid-1);        
       } 
       return ans;
    }
}