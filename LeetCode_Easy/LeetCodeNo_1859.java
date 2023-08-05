// https://leetcode.com/problems/sorting-the-sentence/

// Method-1

class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(String value : arr)
        {
            res[value.charAt(value.length()-1)-'1'] = value.substring(0,value.length()-1);
        }
        return String.join(" ",res);
    }
}

