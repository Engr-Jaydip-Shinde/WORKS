import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        for(int i=list2.size()-1;i>=0;i--){
            System.err.print(list2.get(i)+" ");
        }
    }
}
