import java.util.*;
public class FirstNonrepeating {
    public static void printNonrepeating(String str){
        int freArray[] = new int[26];
        Queue<Character> Q = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            Q.add(ch);
            freArray[ch-'a']++;
            while (!Q.isEmpty() && freArray[Q.peek()-'a'] > 1) {
                 Q.remove();
            }
            if(Q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(Q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str = "aabccxb";
        printNonrepeating(str);
    }
}
 