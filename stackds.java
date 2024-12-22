class Stack { 
    private int[] stackArray;  
    private int top;           
    private int capacity;      
 
     
    public Stack(int size) { 
        stackArray = new int[size]; 
        capacity = size; 
        top = -1;  
    } 
 
     
    public void push(int value) { 
        if (isFull()) { 
            System.out.println("Stack Overflow! Cannot push " + value); 
            return; 
        } 
        stackArray[++top] = value; 
        System.out.println(value + " pushed into the stack."); 
    } 
 
    
    public int pop() { 
        if (isEmpty()) { 
            System.out.println("Stack Underflow! Nothing to pop."); 
            return -1; 
        } 
        return stackArray[top--]; 
    } 
 
     
    public int peek() { 
        if (isEmpty()) { 
            System.out.println("Stack is empty. Nothing to peeek."); 
            return -1; 
        } 
        return stackArray[top]; 
    } 
 
    
    public boolean isEmpty() { 
        return top == -1; 
    } 
 
     
    public boolean isFull() { 
        return top == capacity - 1; 
    } 
 
     
    public void printStack() { 
        if (isEmpty()) { 
            System.out.println("Stack is empty."); 
            return; 
        } 
        System.out.println("Stack elements:"); 
        for (int i = top; i >= 0; i--) { 
            System.out.println(stackArray[i]); 
        } 
    } 
 
    
    public static void main(String[] args) { 
        Stack stack = new Stack(5); 
 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        stack.printStack(); 
 
        System.out.println("Top element is: " + stack.peek()); 
        System.out.println("Popped element is: " + stack.pop()); 
        stack.printStack(); 
 
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}



//output
10 pushed into the stack.
20 pushed into the stack.
30 pushed into the stack.
Stack elements:
30
20
10
Top element is: 30
Popped element is: 30
Stack elements:
20
10
Is stack empty? false
