class Queue {
    private int[] queueArray;  
    private int front;         
    private int rear;          
    private int capacity;      
    private int size;          
    
    
    public Queue(int size) {
        queueArray = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        size = 0;
    }
    
    
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
  
        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;
        System.out.println(value + " enqueued into the queue.");
    }
    
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
            return -1;
        }
      
        int dequeuedValue = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedValue;
    }
    
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queueArray[front];
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    
    public boolean isFull() {
        return size == capacity;
    }
    
    
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queueArray[i]);
        }
    }
    
  
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();
        
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Dequeued element is: " + queue.dequeue());
        queue.printQueue();
        
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}


//output
10 enqueued into the queue.
20 enqueued into the queue.
30 enqueued into the queue.
Queue elements:
10
20
30
Front element is: 10
Dequeued element is: 10
Queue elements:
20
30
Is queue empty? false
