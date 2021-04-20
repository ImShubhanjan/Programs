public class run {

    public static void main(String[] args) {
        LinkedList ob = new LinkedList();
        ob.Insert(1);
        ob.Insert(2);
        ob.Insert(3);
        ob.Insert(4);
//        ob.Insert(5);
//        ob.Insert(6);

//        ob.InsertAtBegin(10);
//        ob.InsertAtBegin(11);
//
//        ob.insertAfterPosition(2,16);
//        ob.insertAfterPosition(5, 19);
//
//        ob.deleteNode(2);
//        ob.deleteNode(4);
        ob.show();
        //System.out.println("Reverse is: ");
        ob.reverse();
        ob.show();
    }
}
