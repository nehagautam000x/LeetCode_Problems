// https://leetcode.com/problems/longest-common-prefix/description/

// Method-1

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
                break;
            answer.append(first[i]);
        }
    return answer.toString();
    }
}