// https://leetcode.com/problems/number-of-employees-who-met-the-target/description/

// 2798. Number of Employees Who Met the Target

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      int count = 0;
      for(int val:hours)
      {
          if(val>=target)
          {
              count++;
          }
      } 
      return count; 
    }
}