import java.util.*;
public class DuplicateParenthesis {
    public static boolean duplicatePar(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count = 0;
                while (s.pop()!='(') {
                    count++;
                }
                if (count<1) {
                    return true;//duplicate
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    } 

    public static void main(String[] args) {
        String str2 = "(((a+b)+(c+d)))";
        System.out.println(duplicatePar(str2));
    }    
}

