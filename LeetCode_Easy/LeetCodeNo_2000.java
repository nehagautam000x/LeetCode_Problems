// https://leetcode.com/problems/reverse-prefix-of-word/description/

// Method-1

class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.contains(Character.toString(ch)))
        {
            StringBuilder sb = new StringBuilder();
            int j=0;
            for(int i=0;i<word.length();i++)
            {
                if(word.charAt(i)==ch)
                {
                    j=i;
                    break;
                }
            }
            sb.append(word.substring(0,j+1)).reverse();
            sb.append(word.substring(j+1));
            return sb.toString();
        }
        else
            return word;
    }
}

