class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
         if(t.length()==0)
        {
            return false;
        }
       char[] arr = s.toCharArray();
       char[] arr2 = t.toCharArray();
      int  j=0;
       for(int i = 0 ;i<arr2.length ;i++)
       {
        if( j<arr.length && arr[j] == arr2[i])
        {
            j++;
        }
       } 

       if(j==arr.length)
       {
        return true;
       }

       return false;
    }
}