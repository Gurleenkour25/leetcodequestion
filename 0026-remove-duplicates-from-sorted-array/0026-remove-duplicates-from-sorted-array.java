class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        int end = 1 ;
        for(int start=1 ;start<n; start++)
        {
            if(nums[start] != nums[end-1])
            {
                nums[end] = nums[start];
                end++;
            }
        }
       

       return end;
    }
}