class Solution {
    public int maxDepth(String s) {
      int maxi =0;
      int count = 0;
      for(char ch: s.toCharArray())
      {
        if(ch == '(')
        {
          count++;
          maxi = Math.max(count,maxi);
        }
        else if(ch==')')
        {
            count--;
        }
      } 

      return maxi; 
    }
}