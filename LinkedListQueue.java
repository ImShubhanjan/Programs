public class LinkedListQueue {
    Node front;
    Node rear;

    LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = rear;
        if(front == null) {
            front = node;
            rear = node;
            front.next = null;
            rear.next = null;
        }
        else {
            rear.next = node;
            rear = node;
            rear.next = null;
        }
        System.out.println("Data Enqueued");
    }
    public void display(){
        Node temp = front;
        if(front == null && rear == null) System.out.println("No Elements in the Queue");
        else {
            while(temp != null) {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
        }
    }
}
