class MinStack {

    Stack<Integer> stack;
    PriorityQueue<Integer> minHeap;

    public MinStack() {

        this.stack = new Stack<>();
        this.minHeap = new PriorityQueue<>();
    }
    
    public void push(int val) {

        minHeap.offer(val);
        stack.push(val);
        
    }
    
    public void pop() {
        
        int removed = stack.pop();
        minHeap.remove(removed);
    }
    
    public int top() {
        
        return stack.peek();
    }
    
    public int getMin() {
        return minHeap.peek();
    }
}
