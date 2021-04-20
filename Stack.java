public class Stack {
    public static void main(String[] args) {
        OperationStack ob = new OperationStack(100);
//        LinkedListStack ob = new LinkedListStack();
        ob.pushData(5);
        ob.pushData(4);
        ob.pushData(3);
        ob.pushData(2);
        ob.pushData(1);

        ob.display();
        ob.popData();
        ob.display();
        ob.popData();
        ob.display();
        ob.popData();
        ob.popData();
        ob.popData();
        ob.display();
    }
}
