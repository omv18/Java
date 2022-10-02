import java.util.*;

class ll {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list"); // add -> this is also add from last
        System.out.println(list);

        list.addFirst("this"); 
        System.out.println(list);

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");

        LinkedList<String> ll = new LinkedList<String>();
        for(int i=0; i<list.size();i++) {
            ll.addFirst(list.get(i));
        }
        for(int i=0; i<list.size();i++){
            System.out.print(ll.get(i)+ " -> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

        // list.remove(); // remove from FIRST index & also give INDEX(for INDEX based delete)  here
        // System.out.println(list);
    }
}