class MinStack {
    Stack<Integer> valueStack;
    Stack<Integer> minStack;

    public MinStack() {
        valueStack = new Stack<>();
        minStack = new Stack<>();
        
    }
    
    public void push(int value) {
        valueStack.push(value);

        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            if (value < minStack.peek()) {
                minStack.push(value);
            } else {
                minStack.push(minStack.peek());
            }
        }
        
    }
    
    public void pop() {
        valueStack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return valueStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */