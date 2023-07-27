// https://leetcode.com/problems/count-items-matching-a-rule/

//Method-1

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(int i=0;i<items.size();i++)
        {
           List<String> item = items.get(i);
            {
                if(ruleKey.equals("color"))
                {
                    if(item.get(1).equals(ruleValue))
                    {
                        c++;
                    }
                }
                else if(ruleKey.equals("type"))
                {
                    if(item.get(0).equals(ruleValue))
                    {
                        c++;
                    }
                }
                if(ruleKey.equals("name"))
                {
                    if(item.get(2).equals(ruleValue))
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}

// Method-2

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            switch (ruleKey) {
                case "color":
                    if (item.get(1).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "type":
                    if (item.get(0).equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "name":
                    if (item.get(2).equals(ruleValue)) {
                        count++;
                    }
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}


// "==" compares references for objects, not the actual content of strings, while .equals() compares the contents of strings for equality. Since you want to compare the content of the strings, .equals() is the correct method to use.