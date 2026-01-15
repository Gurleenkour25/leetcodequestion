class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int mini = Integer.MAX_VALUE;
           int nextsum =0;
        for(int i = 0 ; i < n ; i++) {
            if(i > 0 && nums[i]== nums[i-1])continue;
          int j = i+1;
          int k = n-1;

          while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
         
            if(sum > target)
            {
                int num = Math.abs(sum-target);

                if(num < mini)
                {
                    mini = num;
                    nextsum = sum;
                }

                k--;
            }

            else if(sum < target)
            {
                int num = Math.abs(sum-target);

                if(num < mini)
                {
                    mini = num;
                    nextsum = sum;
                }

             
                j++;
            }

           else if (sum == target)
           {
            return target;
           }




          }
        }
    

       return nextsum;
    }
}