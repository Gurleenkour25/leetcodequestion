class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for(int i = n-2 ; i >=0 ; i--)
        {
            if(nums[i] < nums[i+1])
            {
                pivot = i;
                break;
            }
        }

        if(pivot == -1)
        {
            reverse(nums,0,n-1);

            return;
        }

        for(int i = n-1 ; i > pivot ;i--)
        {
            if(nums[i] > nums[pivot])
            {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
         }

         reverse(nums,pivot+1,n-1);
    }

    public void reverse(int[]arr , int start , int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}