class Solution {
    public String largestOddNumber(String num) {
        int n =  num.length();
        int end = n-1;

        while(end >= 0)
        {
            char last = num.charAt(end);
            if((last-'0') % 2 == 1)
            {
                return num.substring(0,end+1);
            }

            end--;
        }

        return "";
    }
}