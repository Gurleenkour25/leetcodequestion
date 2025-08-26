class Solution {
    public void sortColors(int[] nums) 
    {
        int n = nums.length;
        int []arr = new int[n];
        int j = 0;
        for(int i = 0 ; i<=2 ;i++) 
        {

            for(int k = 0; k < n ; k++) 
            {
                if(nums[k] == i) 
                {
                    arr[j] = i;
                    j++;
                }
            }
        }

        for(int i =0 ;i < n ;i++){
            nums[i] = arr[i];
        }
        
    }
}