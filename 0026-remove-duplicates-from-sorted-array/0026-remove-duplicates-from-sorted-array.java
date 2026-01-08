class Solution {
    public int removeDuplicates(int[] nums) {
        int dupli = nums[0];
        int start = 1;

        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] != dupli)
            {

                dupli = nums[i];
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                
                start++;
            }

            
        }

        return start;
    }
}