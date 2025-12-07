class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxi =0 ;
        int left = 0 ;
        char[] st = s.toCharArray();
        int right = 0;
        while(right < st.length )
         {
            if(set.isEmpty() || !set.contains(st[right]))
            {
                set.add(st[right]);
                maxi = Math.max(maxi,right-left+1);
                right++;
            }
            else 
            {
                set.remove(st[left]);
                left++;
            }
         }

         return maxi;
    }
}