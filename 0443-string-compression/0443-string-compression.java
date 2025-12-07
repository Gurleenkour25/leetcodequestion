class Solution {
    public int compress(char[] chars) {
       int count = 1;
     StringBuilder str = new StringBuilder();
       str.append(chars[0]);
       for(int i = 1 ; i < chars.length ; i++)
       {
           if(chars[i] ==  chars[i-1])
           {
              count++; 
           }
           else{
            if(count > 1)
            {
                str.append(count);
                
            }
            str.append(chars[i]);
            count = 1;
           }
         

       } 

       if(count > 1)
       {
         str.append(count);
       }

       char[] arr = str.toString().toCharArray();
      for(int i = 0 ; i < arr.length ; i++)
      {
        chars[i] = arr[i];
      }
       return arr.length;
    }
}