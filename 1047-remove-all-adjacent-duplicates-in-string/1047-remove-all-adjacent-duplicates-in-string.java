class Solution {
    public String removeDuplicates(String s) {
       ArrayDeque<Character> stack = new ArrayDeque<>();
       char[] arr = s.toCharArray();

       for(int i = 0 ;i<arr.length ; i++)
       {
          if(!stack.isEmpty() && stack.peek()==arr[i])
          {
            stack.pop();
          }
          else{
            stack.push(arr[i]);
          }
       }
    
       StringBuilder ss = new StringBuilder();
       for(char c : stack)
       {
          ss.append(stack.pop());
       }
          
      return ss.reverse().toString();
    }
}