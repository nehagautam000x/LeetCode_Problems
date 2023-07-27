// https://leetcode.com/problems/rotate-string/description/

// Method-1

class Solution {
    public boolean rotateString(String s, String goal) {
        int index = -1;
        for (int i = 0; i < goal.length(); i++) { // Modified loop to cover all positions in 'goal'
            if (s.charAt(0) == goal.charAt(i)) {
                index = i;
                // Perform the check for the rotated string here
                if (s.equals(goal.substring(index) + goal.substring(0, index))) {
                    return true;
                }
            }
        }
        return false;
    }
}