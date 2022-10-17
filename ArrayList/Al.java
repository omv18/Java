import java.util.*;
class Al {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);

        //get 
        int element = list.get(0);
        System.out.println(element);

        //set
        list.add(0,5);
        System.out.println(list);

        //delete
        list.remove(3);
        System.out.println(list);

        //size 
        int si = list.size();
        System.out.println(si);

        //sort
        Collections.sort(list);
        System.out.println(list);

    }
}