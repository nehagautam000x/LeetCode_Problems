// https://leetcode.com/problems/largest-odd-number-in-string/description/

// Method-1
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}

// OR

class Solution {
    public String largestOddNumber(String num) {
        // Search for right most odd digit
        for(int i = num.length() - 1;i >= 0;i--)
        {
            if((num.charAt(i)-'0')%2 != 0)
                return num.substring(0,i+1);
        }
        return "";
    }
}

