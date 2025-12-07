class Solution {
    public String removeDuplicates(String s) {
      Deque<Character> stack = new ArrayDeque<>();
      char[] arr = s.toCharArray();
      for(int i =0 ; i < arr.length ; i++)
      {
        if(!stack.isEmpty() && stack.peek() == arr[i])
        {
           stack.pop();
        }
        else{
            stack.push(arr[i]);
        }
      }

      if(stack.isEmpty())
      {
        return "";
      }

      StringBuilder str = new StringBuilder();

      while(!stack.isEmpty())
      {
        str.append(stack.pop());
      }
      str.reverse();

      return str.toString();

    }
}