import java.util.HashSet;
public class HSbasic {
    public static void main(String[] args) {
        System.out.println("Hello World");
        HashSet<Integer> hS = new HashSet<>();
        hS.add(1);
        hS.add(2);
        hS.add(1);
        hS.add(3);
        hS.add(null);
        System.out.println(hS);
        System.out.println(hS.size());
        System.out.println(hS.remove(3));
        System.out.println(hS.size());
        System.out.println(hS.contains(null));
    }
}
