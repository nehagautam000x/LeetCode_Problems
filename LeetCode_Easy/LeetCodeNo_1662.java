// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

// Method-1

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder sb1 = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();
       for(String value:word1)
       {
           sb1.append(value);
       }
       for(String value:word2)
       {
           sb2.append(value);
       }
       return sb1.toString().equals(sb2.toString());
    }
}

// Method-2

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    if(word1.length == 0 || word2.length == 0) return false;
     return (String.join("",word1).equals(String.join("",word2)));
    }

}