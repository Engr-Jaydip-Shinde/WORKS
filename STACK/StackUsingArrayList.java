import java.util.ArrayList;
public class StackUsingArrayList{
	 static class Stack{
		ArrayList<Integer> list = new ArrayList<>();
		
		public static boolean isEmpty(){
			return list.size()==0;
		}
		
		//Push
		public static void push(int data){
			list.add(data);
			System.out.println(data+" is added to stack");
		}
		
		//pop
		public static int pop(){
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		//peak
		public static int peak(){
			return list.get(list.size()-1);
		} 
	}
	
	public static void main(String argS[]){
	System.out.println("Stack Programm");
	Stack s = new Stack();
	s.push(10);
	s.push(11);
	s.push(12);
	s.push(24);
	s.push(30);
	
	}

}