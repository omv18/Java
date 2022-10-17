import java.util.Scanner;;

class BST {

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    TreeNode root;
    BST() {
        root = null;
    }

    public TreeNode insert(TreeNode root, int dataToBeInserted) {
        if(root == null) {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if(root.data > dataToBeInserted) {
            root.left = insert(root.left, dataToBeInserted);
        }
        else if(root.data < dataToBeInserted) {
            root.right = insert(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int dataToBeSearch) {
        if(root == null || root.data == dataToBeSearch){
            return root;
        }
        if(root.data > dataToBeSearch)
            return search(root.left, dataToBeSearch);
        return search(root.right, dataToBeSearch); 
    }
    //Traversal 
    public void PreOrder(TreeNode root) {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void PostOrder(TreeNode root)  {
        if(root == null)
            return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void insertIntoTree(int dataToBeInserted) {
        root = insert(root, dataToBeInserted);
    }

    public TreeNode searchTree(int dataToBeSearch) {
        return search(root, dataToBeSearch);
    }

    public void PreOrderTraversal() {
        PreOrder(root);
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    public void PostOrderTraversal() {
        PostOrder(root);
    }


    public static void main(String[] args) {
        BST bst = new BST();
        int n, num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers to be input");
        n = scan.nextInt();
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0; i<n; i++) {
            num = scan.nextInt();
            bst.insertIntoTree(num);
        }
        System.out.println("Tree insertion done");

        System.out.println("Enter number to be searched");
        n = scan.nextInt();
        if(bst.searchTree(n) != null) {
            System.out.println("Number is found");
        }
        else{
            System.out.println("Number not found");
        }
        System.out.println("PreOrder traversal of binary search tree");
        bst.PreOrderTraversal();

        System.out.println("\n InOrder traversal of binary search tree");
        bst.inOrderTraversal();

        System.out.println("\n PostOrder traversal of binary search tree");
        bst.PostOrderTraversal();
    }
}