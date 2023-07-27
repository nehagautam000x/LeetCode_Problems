// https://leetcode.com/problems/valid-palindrome/

// Method-1

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<=right)
        {
            if(!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            else if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
            return false;
            else
            {
                left++;
                right--;
            }
        } 
        return true; 
    }
}

// Method-2

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=48 && s.charAt(i)<=57)
          {
            sb.append(s.charAt(i));
          }
        }
        return sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());
    }
}