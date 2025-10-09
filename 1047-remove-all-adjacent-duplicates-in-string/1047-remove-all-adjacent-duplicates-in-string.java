class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i =0 ;i < arr.length ;i++)
        {
            if(!stack.isEmpty() && stack.peek()==arr[i])
            {
                stack.pop();
            }

            else{
                stack.push(arr[i]);
            }
        }

        StringBuilder st = new StringBuilder();
        while(!stack.isEmpty())
        {
            char top = stack.pop();
            st.append(top);
        }

        return st.reverse().toString();
    }
}