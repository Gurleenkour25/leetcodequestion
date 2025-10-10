class Solution {
    public int[] dailyTemperatures(int[] arr) {
    int n = arr.length;
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    int[] res = new int[n];
    for(int i=n-1 ;i>=0 ;i--)
    {
       while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
       {
          stack.pop();
       }
      
      if(!stack.isEmpty())
      {
         res[i] = stack.peek()-i;
      }

       else
       {
         res[i] = 0;
       }
       stack.push(i);
    } 

    return res;
    }
}