// https://leetcode.com/problems/contains-duplicate/description/

// 217. Contains Duplicate


// Method-1

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                count++;
            }
        }
        return count>=1?true:false;
    }
}

//Method: II (Without doing sorting or using nested loop)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length;j++)
            {
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
}


// Method: III (Using HashMap)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
                return true;
            else
                map.put(num,1);
        }
        return false;
    }
}


// Method: IV (Using HashSet)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
																														
// Method: V (By sorting the array)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false
    }
}

	