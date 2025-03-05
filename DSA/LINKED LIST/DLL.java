public class DLL {

    public class Node{
        int data ;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data); 
        size++;  //creat node
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp != null) {
            System.out.print(temp.data+" < - > ");
            temp=temp.next;
        }
        System.out.print("null\n");
        return;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("List is empty.");
            return -1;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public static void main(String[] args) {
        DLL dll1 = new DLL();
        dll1.addFirst(10);
        dll1.addFirst(20);
        dll1.addFirst(30);
        System.out.println(dll1.removeFirst()+" removed");
        dll1.print();
    }   
}
