class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
     Set<Character> set = new HashSet<>();
     char[] arr = s.toCharArray();
     int count = 0;
     int maxi =0;
     int left=0;
     int right =0;
     while(right<n)
     {
       if(!set.contains(arr[right]))
       {
         set.add(arr[right]);
          count++;
        maxi = Math.max(maxi,right-left+1);
        right++;
       }
       else if(set.contains(arr[right]))
       {
         set.remove(arr[left]);
         count=0;
         left++;
       }
     } 

       return maxi;  
    }
}