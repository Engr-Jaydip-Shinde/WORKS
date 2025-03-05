import java.util.ArrayList;

public class PairSum2 {
    static void pivotApproach(ArrayList<Integer> list, int key){
        int j=0,lp, rp;
        for(j=0;j<list.size();j++){
            if(list.get(j)>list.get(j+1)){
                break;
            }
        }
        lp=j+1;
        rp=j;
            while (lp!=rp) {
                if(list.get(lp)+list.get(rp)==key){
                    System.out.print("("+list.get(lp)+","+list.get(rp)+")\n");
                    lp=(lp+1)%list.size();
                }else if(list.get(lp)+list.get(rp)>key){
                    rp=(list.size()+rp-1)%list.size();
                }else{
                    lp=(lp+1)%list.size();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        pivotApproach(list, 16);
    }
}
