public class StackUsingLinkedList{
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	static class Stack{
		static Node head = null;
		public static boolean isEmpty(){
			return head == null;
		}
		
		//push
		public void push(int data){
			Node newNode = new Node(data);
			if(isEmpty()){
				head = newNode;
				return;
			}
			newNode.next = head;
			head=newNode;
		}
		
		//pop
		public int pop(){
			if(isEmpty()){
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		
		//peek
		public int peek(){
			if(isEmpty()){
				return -1;
			}
			return head.data;//top of the stack
		}
	}
	
	public static void main(String args[]){
		Stack s = new Stack();
		s.push(10);
		s.push(2);
		s.push(90);
		s.push(80);
		s.push(8);
		while(! Stack.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}
}
