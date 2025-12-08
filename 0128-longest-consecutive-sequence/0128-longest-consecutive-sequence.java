class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
       int longest = 1;
       if(n == 0)
       {
        return 0;
       } 

       Set<Integer> set = new HashSet<>();

       for(int num : nums) {
         set.add(num);
       }

       for(int s: set) {
        if(!set.contains(s-1))
        {
            int x = s;
            int count = 1;

            while(set.contains(x+1))
            {
                count++;
                longest = Math.max(longest,count);
                x=x+1;
            }
        }
       }

       return longest;
    }
}