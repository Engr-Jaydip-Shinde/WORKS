import java.util.ArrayList;;
public class MaxInArray {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(1);
        list3.add(9);
        list3.add(6);
        list3.add(-1);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list3.size();i++){
            max = Math.max(list3.get(i),max);
        }
        System.out.println(max);
    }
}
