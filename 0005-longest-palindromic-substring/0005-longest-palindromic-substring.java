class Solution {
    public String longestPalindrome(String s) {
        int maxlen =1;
        int start = 0;

        for(int i = 0 ;i<s.length() ; i++)
        {
            int length1 = expand(s,i,i);
            int length2 = expand(s,i,i+1);
            int len = Math.max(length1,length2);

            if(len>maxlen)
            {
                maxlen = len;
                start = i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxlen);
    }

    public int expand(String s , int left , int right)
    {
        char[] arr = s.toCharArray();
        while(left>=0 && right<=arr.length-1 && arr[left]==arr[right])
        {
            left--;
            right++;
        }

        return (right-left)-1;
    }
}