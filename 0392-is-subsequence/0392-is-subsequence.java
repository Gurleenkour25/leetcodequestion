class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()== 0)
        {
            return true;
        }

       
        if(t.length()== 0)
        {
            return false;
        }

        int j =0;
       char[] arr = s.toCharArray();
       char[] arr2 = t.toCharArray();

        for(int i = 0 ;i < arr2.length ; i++)
        {
            if(j < arr.length && arr2[i] == arr[j])
            {
                j++;
            }
        }

        if(j == s.length())
        {
            return true;
        }

        return false;
    }
}