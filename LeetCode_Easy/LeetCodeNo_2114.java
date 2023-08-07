// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

// 2114. Maximum Number of Words Found in Sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] count = new int[sentences.length];
        for(int i=0;i<sentences.length;i++)
        {
            String[] subSentences = sentences[i].split(" ");
            count[i]=subSentences.length;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>max)
            {
                max = count[i];
            }
        }
        return max;
    }
}

