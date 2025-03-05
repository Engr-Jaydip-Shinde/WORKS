import java.util.ArrayList;

public class Monotonic {
    static void check(ArrayList<Integer> list){
            boolean inc=true;
            boolean dec=true;
            for(int i=0;i<list.size()-1;i++){
                if( list.get(i)>list.get(i+1)){
                    inc=false;
                }
                if( list.get(i)<list.get(i+1)){
                    dec=false;
                }
            }
            System.out.println(inc||dec);
    }

        static void check2(ArrayList<Integer> list){
            boolean inc=true;
            boolean dec=true;
            for(int i=0;i<list.size()-1;i++){
                if( list.get(i)>list.get(i+1)){
                    inc=false;
                }
                if( list.get(i)<list.get(i+1)){
                    dec=false;
                }
            }
            System.out.println(inc||dec);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        check(list);
    }
}
