// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

// Method-1

class Solution {
    public boolean halvesAreAlike(String s) {
        // StringBuilder part1 = new StringBuilder();
        // StringBuilder part2 = new StringBuilder();
        String vowel="aeiouAEIOU";
        int v1=0;
        int v2=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(vowel.contains(Character.toString(s.charAt(i))))
            {
                v1++;
            }
            // part1.append(s.charAt(i));
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(vowel.contains(Character.toString(s.charAt(i))))
            {
                v2++;
            }
            // part1.append(s.charAt(i));
        }
        return v1==v2;
    }
}



