class Solution {
    public boolean isValid(String s) {
       char[] arr = s.toCharArray(); 

       ArrayDeque<Character> stack = new ArrayDeque<>();
       for(int i =0 ;i<arr.length ; i++)
       {
       if(arr[i]=='(' ||arr[i]=='[' || arr[i]=='{')
       {
            stack.push(arr[i]);
       } 
        else if(arr[i] == ')' || arr[i] == '}' ||arr[i] == ']')
        {
            if(stack.isEmpty()) return false;
            char top = stack.pop();

            if(arr[i]=='}' && top != '{' || arr[i]==')' && top != '(' || arr[i]==']' && top != '[')
            {
                   return false;
            }

        }
       }
       
       if(stack.isEmpty())
       {
        return true;
       }

       return false;
    }
}