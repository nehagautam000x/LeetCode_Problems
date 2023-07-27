// https://leetcode.com/problems/merge-strings-alternately/description/

// Method-1
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Math.min(word1.length(),word2.length());i++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length()>word2.length())
        {
            for(int i=Math.min(word1.length(),word2.length());i<Math.max(word1.length(),word2.length());i++)
            {
                sb.append(word1.charAt(i));
            }
        }
        else
        {
            for(int i=Math.min(word1.length(),word2.length());i<Math.max(word1.length(),word2.length());i++)
            {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}

// Method-2

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        if (word1.length()>word2.length())
        {
            for(int i=0;i<word2.length();i++)
            {
               str.append(word1.charAt(i));
               str.append(word2.charAt(i));
            }
            str.append(word1.substring(word2.length(),word1.length()));
            return str.toString();

        }else if(word1.length()<word2.length())
        {
            for(int i=0;i<word1.length();i++)
            {
               str.append(word1.charAt(i));
               str.append(word2.charAt(i));
            }
            str.append(word2.substring(word1.length(),word2.length()));
            return str.toString();
        }else
        {
            for(int i=0;i<word2.length();i++)
            {
               str.append(word1.charAt(i));
               str.append(word2.charAt(i));
            }
            return str.toString();

        }
        
    }
}