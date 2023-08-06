// https://leetcode.com/problems/height-checker/description/

// 1051. Height Checker


class Solution {
    public int heightChecker(int[] heights) {
        int[]  res = Arrays.copyOf(heights,heights.length);
        Arrays.sort(res);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=res[i])
            {
                count++;
            }
        }
        return count;
    }
}