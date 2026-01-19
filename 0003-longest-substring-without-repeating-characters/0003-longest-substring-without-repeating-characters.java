class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0 , left = 0;
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int maxi = 0;
        while(right  < arr.length)
        {
            if(!set.contains(arr[right]))
            {
                set.add(arr[right]);
                maxi = Math.max(maxi, right-left+1);
                right++;
            }
            else{
                set.remove(arr[left]);
                left++;
            }
        }

        return maxi;
    }
}