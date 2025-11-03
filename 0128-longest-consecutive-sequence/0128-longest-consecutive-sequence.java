class Solution {
    public int longestConsecutive(int[] nums) {

       Set<Integer> set = new HashSet<>();
int maxi =0;
       for(int num : nums)
       {
         set.add(num);
       }

       for(int s : set) {
        if(!set.contains(s-1))
        {
            int count = 1;
            int x = s;

            while(set.contains(x+1)) {
                count++;
                x= x+1;
            }

            maxi = Math.max(maxi,count);
        }
       } 

       return maxi;
    }
}