public class LinkedListStack {
//    Node head;
    Node top;
    public LinkedListStack(){
        this.top = null;
    }
    public void pushData(int data) {
        Node node = new Node();
        node.data = data;
        node.next = top;
        top = node;
        System.out.println("Data Inserted");
    }
    public void display() {
        Node temp;
        temp = top;
        if(top == null) System.out.println("Stack Underflow");
        else {
            while(temp != null) {
                System.out.print("<-"+temp.data);
                temp = temp.next;
            }
        }
    }
    public void popData() {
        Node temp;
        if(top == null) {
            System.out.println("Stack Underflow");
        }
        else {
            temp = top;
            top = top.next;
        }
        System.out.println("\nData deleted\n");
    }
}
