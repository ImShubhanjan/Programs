public class LinkedList {
    Node head;
    public void Insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        }
        else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAfterPosition(int pos, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        if(pos == 0) {
            InsertAtBegin(data);
        }
        else {
            for (int i = 0; i < pos - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void InsertAtBegin(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    public void deleteNode(int loc) {
        if(loc == 0){
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for (int i=0; i<loc-1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Removed: "+n1.data);
        }
    }
    public void show() {
        Node newnode = head;
        while(newnode.next != null){
            System.out.print(newnode.data + "-> ");
            newnode = newnode.next;
        }
        System.out.print(newnode.data);
    }
    public void reverse() {
        Node prevnode = null;
        Node curr, nextnode;
        curr = nextnode = head;
        while(nextnode != null) {
            nextnode = nextnode.next;
            curr.next = prevnode;
            prevnode = curr.next;
            curr = nextnode;
        }
        head = prevnode;
        System.out.println();
        System.out.println("Reverse done!");
        System.out.println();
    }
}
