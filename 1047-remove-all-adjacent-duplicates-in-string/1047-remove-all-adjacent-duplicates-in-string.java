class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque();
        char [] arr = s.toCharArray();
        int n = arr.length;
        int i =0;
        while(i<n) 
        {
            if(stack.isEmpty())
            {
                stack.push(arr[i]);
            }
          else if(!stack.isEmpty() && stack.peek()==arr[i])
          {
            stack.pop();
          }

          else {
            stack.push(arr[i]);
          }
           
           i++;
        }


       StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            char top = stack.pop();
            sb.append(top);
        }

        sb.reverse();

        return sb.toString();
    }
}