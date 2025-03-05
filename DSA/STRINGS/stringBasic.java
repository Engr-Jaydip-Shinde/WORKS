import java.util.*;
public class stringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcd";
        String str2 = new String("xyz");
        String name = sc.nextLine();
        //Strings are immutable
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(str);
        System.out.println(str2);
        sc.close();
    }
}
