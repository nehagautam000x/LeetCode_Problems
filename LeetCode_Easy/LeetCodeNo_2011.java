// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

// 2011. Final Value of Variable After Performing Operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String val:operations)
        {
            if(val.equals("--X") || val.equals("X--"))
            {
                x--;
            }
            else if(val.equals("X++") || val.equals("++X"))
            {
                x++;
            }
        }
        return x;
    }
}