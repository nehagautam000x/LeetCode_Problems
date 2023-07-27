// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/

// Method-1

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        //System.out.println(Arrays.toString(str));
        // int j=0;
        for(int i=str.length-1;i>=0;i--)
        {
            if(!str[i].isEmpty())
            {
                sb.append(str[i]);
                if(i!=0)
                {
                    //System.out.println("&&");
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}