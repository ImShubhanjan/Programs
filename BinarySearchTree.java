import java.util.Scanner;

class NodeBST {
    int data;
    NodeBST left;
    NodeBST right;
}

class OperationOnBST {
    public NodeBST createNode(int val) {
        NodeBST node = new NodeBST();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public NodeBST insert(NodeBST newnode, int val) {
        if(newnode == null) {
            return createNode(val);
        }
        if(val < newnode.data) {
            newnode.left = insert(newnode.left, val);
        }
        else if (val > newnode.data){
            newnode.right = insert(newnode.right, val);
        }
        return newnode;
    }
    public NodeBST delete(NodeBST node, int val) {
        if(node == null) return null;
        if(val < node.data) node.left = delete(node.left,val);
        else if(val > node.data) node.right = delete(node.right,val);
        else {
            if(node.left == null || node.right == null) {
                NodeBST temp = null;
                temp = node.left == null ? node.right:node.left;

                if(temp == null) return null;
                else return node;
            }
            else {
                NodeBST succ = getSuccesor(node);
                node.data = succ.data;
                node.right = delete(node.right,succ.data);
                return node;
            }
        }
        return node;
    }
    public NodeBST getSuccesor(NodeBST node) {
        if(node == null) return null;

        NodeBST temp = node.right;
        while(temp != null)
            temp = temp.left;
        return temp;
    }
    public void inorderPrint(NodeBST node) {
        if(node == null) return;

        inorderPrint(node.left);
        System.out.print(node.data+ " ");
        inorderPrint(node.right);
    }
    public void preorderPrint(NodeBST node) {
        if(node == null) return;

        System.out.print(node.data +" ");
        preorderPrint(node.left);
        preorderPrint(node.right);
    }
    public void postorderPrint(NodeBST node) {
        if(node == null) return;

        postorderPrint(node.left);
        postorderPrint(node.right);
        System.out.print(node.data + " ");
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            OperationOnBST ob = new OperationOnBST();
            NodeBST root = null;
        while(true) {
            System.out.println("\n************************");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Print Data in Inorder");
            System.out.println("4. Print Data in Preorder");
            System.out.println("5. Print Data in Postorder");
            System.out.println("0. Exit");
            System.out.println("Enter your Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    System.out.println("Enter the Data: ");
                    int val = sc.nextInt();
                    root = ob.insert(root, val);
                    System.out.println("Data Inserted");
                    break;
                }
                case 2: {
                    System.out.println("Enter Data which you want to delete: ");
                    int del = sc.nextInt();
                    root = ob.delete(root,del);
                    System.out.println("Data Deleted");
                    break;
                }
                case 3: {
                    System.out.println("Inorder Traversal: ");
                    ob.inorderPrint(root);
                    break;
                }
                case 4: {
                    System.out.println("Preorder Traversal: ");
                    ob.preorderPrint(root);
                    break;
                }
                case 5: {
                    System.out.println("Postorder Traversal: ");
                    ob.postorderPrint(root);
                    break;
                }
                case 0: {
                    System.out.println("End....");
                    System.exit(0);
                }
            }
        }
    }
}
