class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
       int write =0;
       int read=0;
       int count = 0;
       while(read < n)
       {
          char compress = chars[read];
           count =0;
          while(read < n && chars[read] == compress)
          {
            read++;
             count++;
          }
          
          chars[write] = compress;
          write++;

          if(count > 1 )
          {
            String s = Integer.toString(count);
            for(int i =0 ; i < s.length() ; i++)
            {
                chars[write] = s.charAt(i);
                write++;
            }
          }
          
       } 
       return write;
    }
}