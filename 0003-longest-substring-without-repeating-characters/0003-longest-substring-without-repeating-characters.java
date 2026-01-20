class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int size = 0;
       int  maxi = 0;

       char[] arr = s.toCharArray();
       int i = 0;
       int j = 0;
       while(i < s.length())
       {
         if(!set.isEmpty() && set.contains(arr[i]))
         {
            set.remove(arr[j]);
            j++;
         }

         else{
            maxi = Math.max(maxi,i-j + 1);

            set.add(arr[i]);
             i++;
         }
       }

       return maxi;
    }
}