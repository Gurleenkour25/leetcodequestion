class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            // when we reach the end of the current jump range
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }
}
