class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> min;

    public MinStack() {
        stack = new ArrayList<Integer>();
        min = new ArrayList<Integer>();
        
    }
    
    public void push(int val) {
        stack.add(val);
        if(min.size() == 0 || val < min.get(min.size()-1)) min.add(val);
        else min.add(min.get(min.size() - 1));
        
    }
    
    public void pop() {
        if(stack.size() != 0) {
             min.remove(min.size()-1);
            stack.remove(stack.size()-1);
        }
        
    }
    
    public int top() {
        if(stack.size() != 0) {
            int res = stack.get(stack.size() - 1);
            return res;
        } else return 0;
        
        
    }
    
    public int getMin() {
        if(min.size() != 0 ) {
            int res = min.get(min.size()-1);
            return res;
        } else return 0;
        
    }
}
