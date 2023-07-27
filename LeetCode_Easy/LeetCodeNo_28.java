// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

// Method-1
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
        {
            for(int i=0;i<haystack.length();i++)
            {
                int j=i+needle.length();
                if(haystack.substring(i,i+needle.length()).equals(needle) && j<=haystack.length())
                {
                    return i;
                }
            }
        }
        return -1;
    }
}