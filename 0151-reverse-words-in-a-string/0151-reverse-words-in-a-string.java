class Solution {
    public void reversee(StringBuilder str, int start, int end)
    {
        while(start < end)
        {
        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end , temp);
        start++;
        end--;
        }
    }
    public String reverseWords(String s) {
       int n = s.length();
       int i = 0 ;
       int j = n -1;

       while(i < n && s.charAt(i)==' ')i++; 
       while(j >= 0 && s.charAt(j)==' ')j--;
        

        
StringBuilder str = new StringBuilder();

       while(i <= j) 
       {
        if(s.charAt(i) != ' ')
        {
            str.append(s.charAt(i));
        }
        
          else if(str.charAt(str.length() -1) != ' ')
           {
             str.append(' ');
           }
    
          i++;
       }

      str.reverse();
     
     int end = 0;
    for(int start = 0 ; start < str.length() ;start++)
    {
        if(str.charAt(start) == ' ')
        {
            reversee(str,end,start-1);
            end = start+1;
        }
    }

    reversee(str,end, str.length()-1);

    return str.toString();
    }
}