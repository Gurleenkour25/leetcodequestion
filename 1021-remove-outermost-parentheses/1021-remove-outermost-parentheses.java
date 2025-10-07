class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        char[] arr = s.toCharArray();
       int count = 0;
       for(int i = 0;i < arr.length ; i++)
       {
         if(arr[i] == '(')
         {
            if(i > 0 && count > 0)
             {
                str.append('(');
             }
             count++;
         }
          else if(arr[i] == ')')
         {
            count--;
            if(i > 0  && count > 0)
             {
                str.append(')');
             }
             
         }
       }

       return str.toString();
    }
}