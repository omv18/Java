class StackLL {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head = null;

        public static void push(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }

        //empty
        public static boolean isEmpty() {
            return head == null;
        }

        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }

    }
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}

// public class StackLL {
//     private static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }

//     static class Stack {
//         public static Node head = null;
//         public static void push(int data) {
//             Node newNode = new Node(data);

//             if(head == null) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         public static boolean isEmpty() {
//             return head == null;
//         }

//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             Node top = head;
//             head = head.next;
//             return top.data;
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             Node top = head;
//             return top.data;
//         }
//     }

//     public static void main(String args[]) {
//         Stack stack = new Stack();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);

//         while(!stack.isEmpty()) {
//             System.out.println(stack.peek());
//             stack.pop();
//         }
//     }
// }