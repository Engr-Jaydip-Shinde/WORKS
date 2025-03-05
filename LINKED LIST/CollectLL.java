import java.util.LinkedList; //JCF --> java collection framework

public class CollectLL {
    public static void main(String[] args) {
        
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);

        //print
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();

        //print
        System.out.println(ll);
    }
}
