// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/

// 1502. Can Make Arithmetic Progression From Sequence

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=d)
            {
                return false;
            }
        }
        return true;
    }
}