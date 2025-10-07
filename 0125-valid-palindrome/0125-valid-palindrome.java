class Solution {
    public boolean isPalindrome(String s) {
     s= s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();
      char[] arr = s.toCharArray();
       
       int n = arr.length;
      int i = 0 ;
      int j = n-1;

      while(i < j)
      {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }

      String str = new String(arr);

      if(str.equals(s))
      {
        return true;
      }
      else {
        return false;
      }

    }
}