import java.util.ArrayList;
import java.util.Collections;
public class swap {
    static void swap1(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> newList = new ArrayList<>();
        // newList.add(3);
        // newList.add(1);
        // newList.add(6);
        // newList.add(9);
        // newList.add(5);
        System.out.println(newList);

        //Soring
        Collections.sort(newList);//In ascending order
        System.out.println(newList);
        
        //Swaping
        swap1(newList, 1, 3);
        System.out.println(newList);  
    }
}
