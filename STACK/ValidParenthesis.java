import java.util.*;
public class ValidParenthesis {

    public static boolean validParenthesis(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if (ch == '(' || ch == '{' ||ch == '[' ){ 
                s.push(str.charAt(i));
            } else { 
                // closing
                if(s.isEmpty()){
                    return true;
                }
                if((ch==')' && s.peek()=='(') || (ch==']' && s.peek()=='[') || (ch=='}' && s.peek()=='{')) {
                    s.pop();
                }else{
                    return false;
                    }
        }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
            }
    }
    public static void main(String[] args) {
        String str = "{[](){{[]}}[]}";
        System.out.println(validParenthesis(str));
    }    
}
