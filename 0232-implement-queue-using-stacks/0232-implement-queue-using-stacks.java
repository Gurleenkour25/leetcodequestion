class MyQueue {
 private ArrayDeque<Integer> stack ;
  private ArrayDeque<Integer> stack2;
    public MyQueue() {
     stack = new ArrayDeque<Integer>();
     stack2 = new ArrayDeque<Integer>();   
    }
    
    public void push(int x) {
       stack.push(x); 
    }
    
    public int pop() {
        if(stack2.isEmpty())
        {
       while(!stack.isEmpty()) 
       {
         stack2.push(stack.pop());
        
       }
        }
    
       return stack2.pop();
    }
    
    public int peek() {
         if(stack2.isEmpty())
        {
       while(!stack.isEmpty()) 
       {
         stack2.push(stack.pop());
        
       }
    }
       return stack2.peek();
    }
    
    public boolean empty() {
        return stack2.isEmpty()&& stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */