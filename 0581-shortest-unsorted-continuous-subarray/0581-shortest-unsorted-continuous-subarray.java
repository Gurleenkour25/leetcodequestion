class Solution {
    public int findUnsortedSubarray(int[] nums) {

        
        int n = nums.length;

        if(n <= 1)
        {
            return 0;
        }

        int maxi = -1;
        int mini = -1;

        int start = nums[0];

        for(int i = 1 ; i < n ; i++)
        {
            if(nums[i] < start)
            {
                maxi = i;
            }
            else{
                start= nums[i];
            }
        }

        int end = nums[n-1];

        for(int i = n-2 ; i >= 0 ; i--)
        {
            if(nums[i] > end)
            {
                mini = i;
            }
            else{
                end = nums[i];
            }
        }


        if(maxi == -1) return 0;

        return maxi-mini + 1;
    }
}