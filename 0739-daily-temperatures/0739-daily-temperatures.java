class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int [] res = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        for(int i = n-1 ;i>=0 ;i--)
        {
            while(!stack.isEmpty() && temp[stack.peek()]<=temp[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                res[i] = stack.peek()- i;
            }
            else{
                res[i] = 0;
            }
               stack.push(i);
        }

       return res;
        
    }
}