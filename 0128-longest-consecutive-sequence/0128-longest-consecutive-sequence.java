class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0)
        {
            return 0;
        }

        if(n == 1)
        {
            return 1;
        }
        Arrays.sort(nums);
        int count = 1;
        int maxi =0;
        for(int i = 1; i < n ; i++) {
            if(nums[i-1] == nums[i])
            {
                continue;
            }
             if(nums[i-1] == nums[i]-1 ) {
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