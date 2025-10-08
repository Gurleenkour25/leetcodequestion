class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0,j = s.length()-1;
        while(i<j)
        {
            if(arr[i] != arr[j])
            {
                //skip the either from right or from left
                return palidrome(arr,i+1,j) || palidrome(arr,i,j-1);
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean palidrome(char[] arr , int i ,int j)
    {
        while(i<j)
        {
            if(arr[i] != arr[j])
            {
               return false;
            }
            i++;
            j--;
        }
        return true;
    }
}