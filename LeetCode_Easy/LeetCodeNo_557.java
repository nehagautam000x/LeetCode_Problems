// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

// Method-1

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sb1 = s.split(" ");
        int i=0;
        for(String value:sb1)
        {
            StringBuilder rev = new StringBuilder();
            rev.append(value).reverse();
            sb.append(rev);
            if(i!=sb1.length-1)
            {
                sb.append(" ");
            }
            i++;
        }
        System.gc();
        return sb.toString();
    }
}


