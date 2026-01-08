class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int count =1;
        int n = nums.length;
        for(int i = 1 ; i<n ; i++)
        {
            if(nums[i] != nums[index]) {
               index++;
               nums[index] = nums[i];
               count++;
            }
        }

        return count;
    }
}