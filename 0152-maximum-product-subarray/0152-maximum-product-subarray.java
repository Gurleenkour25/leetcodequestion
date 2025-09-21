class Solution {
    public int maxProduct(int[] nums) {
        int maxsofar = nums[0];
        int minsofar = nums[0];
        int result = nums[0];

        for(int i=1 ;i<nums.length;i++) {
            int tempmax = maxsofar;
            int tempmin = minsofar;
            maxsofar = Math.max(nums[i],Math.max(nums[i]*tempmax,nums[i]*tempmin));
            minsofar = Math.min(nums[i],Math.min(nums[i]*tempmax,nums[i]*tempmin));

            result = Math.max(result,maxsofar);
        }
        
        return result;
    }
}