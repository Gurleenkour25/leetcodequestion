class Solution {
    public boolean isPalindrome(String s) {
      s= s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();
       StringBuilder str =  new StringBuilder(s);
       str =str.reverse(); 
       String ss = str.toString();

       if(ss.equals(s))
       {
          return true;
       }
       else {
        return false;
       }
    }
}