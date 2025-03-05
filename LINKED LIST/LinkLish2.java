public class LinkLish2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail =newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("LL is empty");
        }
        head=head.next;
    }
    

    public void pirint(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }

    void addAtIdx(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }


    public static void main(String args[]){
        LinkLish2 ll = new LinkLish2();
        ll.addFirst(10);
        System.out.println(ll.tail.next);

    }
}
