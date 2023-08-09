// https://leetcode.com/problems/create-target-array-in-the-given-order/
 
// 1389. Create Target Array in the Given Order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<index.length;i++)
        {
            list.add(index[i],nums[i]);

        }
        for(int i=0;i<index.length;i++)
        {
            target[i]=list.get(i);
        }
        return target;
    }
}