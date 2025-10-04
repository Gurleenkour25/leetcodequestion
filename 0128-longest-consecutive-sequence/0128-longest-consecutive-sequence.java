class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count =1 ;
        int maxi =1;

        for(int i =1 ;i<nums.length ;i++)
        {   
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            if(nums[i-1] == nums[i]-1)
            {
                count++;
                maxi = Math.max(maxi,count);
            }
            else{
                count = 1;
            }
        }

        return maxi;
    }
}