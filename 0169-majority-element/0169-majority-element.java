class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n==1) { return nums[0];}
         int count = n/2;
         int sum=1;
         Arrays.sort(nums);
         for(int i =1 ;i < n ; i++) {
            if(nums[i] == nums[i-1]) {
                sum++;
                if(sum > count) {
                    return nums[i];
                }
            }
            else {
                sum=1;
            }
         }

        return -1;

    }
}