// https://leetcode.com/problems/goal-parser-interpretation/

//Method-1

class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                str.append('G');
            }
            else if(command.charAt(i)=='(' && i+1<command.length() && command.charAt(i+1)==')')
            {
                str.append('o');
                i++;
            }
            else{
                str.append("al");
                i+=3;
            }
        } 
        return str.toString();       
    }
}

//Method-2

