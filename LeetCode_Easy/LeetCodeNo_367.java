// https://leetcode.com/problems/valid-perfect-square/description/

// 367. Valid Perfect Square


class Solution {
    public boolean isPerfectSquare(int num) {
        int start =0;
        int end = num;
        while(start<=end)
        {
            long mid = start + (end-start)/2;
            double val = mid*mid;
            if(val<num)
                start = (int)(mid+1);
            else if(val>num)
                end = (int)(mid-1);
            else
                return true;      
        } 
        return false;
    }
}