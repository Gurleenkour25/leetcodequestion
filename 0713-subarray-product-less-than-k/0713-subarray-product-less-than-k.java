class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n =  nums.length;
        int count =0;
        //int product = 1;
    
        for(int i = 0 ; i < n ; i++)
        {
            int product = 1;
            if(nums[i] < k)
            {
                count++;
            }

            product =  product* nums[i];
            
            int j = i + 1;
            while(j < n){
                product = product * nums[j];
                if(product < k)
                {
                     count++;
                     j++;

                }

                else{ product = 1;
                    break;
                }

            }
          

            
        }

        return count;
    }
}