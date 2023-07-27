// https://leetcode.com/problems/defanging-an-ip-address/description/

//Method-1
class Solution {
    public String defangIPaddr(String address) {
        String str ="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                str+="["+"."+"]";
            }
            else{
                str+=address.charAt(i);
            }
        }
        return str;
    }
}

//Method-2
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

//Method-3
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                str.append("[.]");
            }
            else{
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
}