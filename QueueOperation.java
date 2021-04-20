public class QueueOperation {
    private int front = 0, rear = 0;
    private int[] queueArr;
    private int max;
    QueueOperation(int size) {
        max = size;
        queueArr = new int[size];
    }
    public void insert(int data) {
        if(rear >= max+1) System.out.println("Queue Overflow");
        else {
            queueArr[rear] = data;
            rear++;
            System.out.println("Data Inserted");
        }
    }
    public void display() {
        if(front == rear) System.out.println("\nNo Elements in the Queue\n");
        for(int i=front; i<rear; i++) {
            System.out.print(queueArr[i]+"->");
        }
    }
    public void delete() {
        if (front == 0 && rear == 0) System.out.println("Queue Underflow");
        else {
            int store = queueArr[front];
            front++;
            System.out.println("\nData Deleted: "+store);
        }
    }
}
