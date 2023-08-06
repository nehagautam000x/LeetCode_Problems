// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

// 1491. Average Salary Excluding the Minimum and Maximum Salary


class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double add = 0;
        for(int i=1;i<salary.length-1;i++)
        {
            add+=salary[i];
        }
        return add/(salary.length-2);
    }
}