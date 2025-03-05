import java.util.*;
public class StackUsing2Queues{

    static class stack{
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();

        public boolean isEmpty(){
            return Q1.isEmpty() && Q2.isEmpty();
        }

        public void push(int data){
            if(!Q1.isEmpty()){
                Q1.add(data);
            }else{
                Q2.add(data);
            }
        }

        public int pop(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            if(!Q1.isEmpty()){
                while (!Q1.isEmpty()) {
                    top=Q1.remove();
                    if (Q1.isEmpty()) {
                        break;
                    }
                    Q2.add(top);
                }
            }else{
                while (!Q2.isEmpty()) {
                    top=Q2.remove();
                    if (Q2.isEmpty()) {
                        break;
                    }
                    Q1.add(top);
                }
            }return top;
        }
        public int peek(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            if(!Q1.isEmpty()){
                while (!Q1.isEmpty()) {
                    top=Q1.remove();
                    Q2.add(top);
                }
            }else{
                while (!Q2.isEmpty()) {
                    top=Q2.remove();
                    Q1.add(top);
                }
            }return top;
        }
    }
    public static void main(String[] args) {
         stack s = new stack();
         s.push(10);
         s.push(20);
         s.push(30);
         s.push(40);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }     
    }
}
