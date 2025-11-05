class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
       if(n == 0) {
        return 0;
       }
  
       int longest = 1; 

       Set<Integer> set = new HashSet<>();

       for(int num : nums) {
         set.add(num);
       } 

       for(int s : set)
       {
        if(!set.contains(s-1))
        {
            int count = 1;
            int x = s;
        

        while(set.contains(x+1))
        {
            count++;
            x = x+1;

            longest = Math.max(longest, count);
        }

        }

       }

       return longest;
    }
}