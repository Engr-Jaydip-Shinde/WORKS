import java.util.ArrayList;
import java.util.Collections;
public class Lonely {
    static void check(ArrayList<Integer> list2){
        Collections.sort(list2);
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for (int i=1; i < list2.size()-1; i++){
            if(list2.get(i+1) == list2.get(i)+1 || list2.get(i-1) == list2.get(i)-1 || list2.get(i+1) == list2.get(i)){
                count++;
            }else{
                list.add(list2.get(i));
            }
        }
        System.out.println(list2);
        if(list2.get(0) != list2.get(1)-1){
            list.add(list.get(0));
        }
        System.out.println(list);
        if(list2.get(list2.size()-1) != list2.get(list2.size()-2)+1 ){
            list.add(list2.get(list2.size()-1));
        }
        System.out.println(count);
        System.out.println(list);
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        check(list);
    }
}
