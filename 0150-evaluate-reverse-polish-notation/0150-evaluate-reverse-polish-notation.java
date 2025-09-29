class Solution {
    public int opeartion(String s  , int a , int b)
    {
        
        switch(s) {
            case "+":
            return a+b;

            case "-":
            return a-b;

            case "*":
            return a*b;

            case "/":
            return a/b;

            case "^":
            return (int)Math.pow(a,b);

           default: throw new IllegalArgumentException("Invalid operator: " + s);
            

        }
        
    }

    public int evalRPN(String[] tokens) 
    {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = tokens.length;
    
         for(int i =0 ; i<n ;i++)
         {
            String token = tokens[i];
            if(token.matches("-?\\d+"))
            {
                stack.push(Integer.parseInt(token));
            }

            else {
            
                
                    int val2 = stack.pop();
                    int val1 = stack.pop();
                

                int res = opeartion(tokens[i],val1,val2);
                stack.push(res);
            }
           
         }
          return stack.pop();
    }    
     
}