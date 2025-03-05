import java.util.*;

public class ReverseString {

    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr = new StringBuilder("");
        while (!s.isEmpty()){
            newStr.append(s.pop());            
        }

        System.out.println(newStr.toString());
    }
    public static void main(String[] args) {
       
        reverseString("JAYDIP");
        
    }
    
}
