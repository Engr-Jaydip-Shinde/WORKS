public class upperCase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String str = "hi, i am jaydip shinde";
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            } 
        }
        System.out.println(sb);
    }
}
