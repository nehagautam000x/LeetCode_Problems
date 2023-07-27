// https://leetcode.com/problems/length-of-last-word/description/

// Method-1

class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if (s.charAt(i)!=' ')
            {
                c++;
            }
            else 
            {
                if(c>0)
                {
                return c;
                }
            }
        }
        return c;
    }
}

// Method-2

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}