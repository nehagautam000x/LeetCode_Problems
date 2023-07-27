// https://leetcode.com/problems/shuffle-string/submissions/1001728274/

//Method-1
class Solution {
    public String restoreString(String s, int[] indices) {
    char[] res = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            res[indices[i]]=s.charAt(i);
        }
        return new String(res);
    }
}

