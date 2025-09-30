class Solution {
    public boolean isSubsequence(String s, String t) {

       char[] a = t.toCharArray();

       char[] b = s.toCharArray();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])
              {
                j++;
              }

            i++;
        }

        if(j!=b.length)
        {
            return false;
        }
        return true;
    }
}