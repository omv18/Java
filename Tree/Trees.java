import java.util.*;

public class Trees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Create
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Traversing
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if(root == null) {
            return;
        } 
        inOrder(root.left);
        System.out.print(root.data + " "); 
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if(root == null) {
            return;
        } 
        postOrder(root.left); 
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //Level order
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    //Count Nodes
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes= countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    //Sum Of All Nodes
    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum= sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data ;
    }

    //Height Of a Tree
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        
        return myHeight;
    }

    //Diameter 
    //n*n
    public static int diameter(Node root) {
        if( root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    //n
    static class TreeInfo {
        int ht;
        int diam;
         
        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
       if(root == null) {
        return new TreeInfo(0,0);
       }

       TreeInfo left = diameter2(root.left);
       TreeInfo right = diameter2(root.right);

       int myHeight = Math.max(left.ht, right.ht) + 1;

       int diam1 = left.diam;
       int diam2 = right.diam;
       int diam3 = left.ht + right.ht + 1;

       int mydiam = Math.max(Math.max(diam1, diam2), diam3);

       TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
       return myInfo;
    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =  tree.buildTree(nodes);
        System.out.println(root.data);

        preOrder(root);

        System.out.println();
        inOrder(root);

        System.out.println();
        postOrder(root);

        System.out.println();
        System.out.println("LEVEL ORDER");
        levelOrder(root);

        System.out.println();
        System.out.println("Count Nodes ");
        System.out.println(countOfNodes(root));

        System.out.println();
        System.out.println("Sum Of Nodes ");
        System.out.println(sumOfNodes(root));

        System.out.println();
        System.out.println("Height Of Tree ");
        System.out.println(height(root));

        System.out.println();
        System.out.println("Diameter Of a Tree O (n*n) ");
        System.out.println(diameter(root));

        System.out.println();
        System.out.println("Diameter Of a Tree O(n)");
        System.out.println(diameter2(root).diam);

    }
}