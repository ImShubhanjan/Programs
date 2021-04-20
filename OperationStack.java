public class OperationStack {
    int arr[];
    int top = -1;
    int max;
    public OperationStack(int size) {
        this.max = size;
        arr = new int[size];
    }
    public int isFull() {
        if(top >= max+1) return 1;
        else return 0;
    }
    public int isEmpty() {
        if(top == -1) return 1;
        else return 0;
    }
    public void pushData(int data) {
        if(isFull() == 1) System.out.println("Stack Overflow");
        else {
           top++;
           arr[top] = data;
           System.out.println("Data Inserted");
        }
    }
    public void popData() {
//        if(isEmpty() == 1) System.out.println("Stack Underflow");
//        else {
            int store = arr[top];
            top--;
            System.out.println("\nElement popped: "+store);
//        }
    }
    public void display() {
        if(isEmpty() == 1) System.out.println("\nNo Elements in the Stack");
        for(int i=top; i>=0; i--) {
            System.out.print("->" +arr[i]);
        }
    }
}