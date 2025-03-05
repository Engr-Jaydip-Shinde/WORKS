import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        } 

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }

        //nextgreater in right side
        //nextgreater in left side --> reverse for loop in code
        //nextsmaller in right side 
        //nextsmaller in left side --> just change comparison in while loop
    }
}
