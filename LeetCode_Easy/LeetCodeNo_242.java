// https://leetcode.com/problems/valid-anagram/description/

// Method-1

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr2[j]='*';
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr2.length;i++)
        {
            if (arr2[i]!='*')
            {
                return false;
            }
        }
        
        return true;
    }
}

// Method-2

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       return Arrays.equals(arr1,arr2);
    }
}

// Method-3

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int test:arr)
            if(test!=0)
                return false;
        return true;
    }
}