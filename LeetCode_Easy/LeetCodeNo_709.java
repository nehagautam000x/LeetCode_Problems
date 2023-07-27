// https://leetcode.com/problems/to-lower-case/description/

// Method-1

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}

// Method-2

class Solution {
    public String toLowerCase(String s) {
        String newS = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                newS += (char)(s.charAt(i) + 32);
            else if(s.charAt(i)>=97 && s.charAt(i)<=122 )
                newS += s.charAt(i);
            else
                newS += s.charAt(i);
            
        }
        return newS;
    }
}
