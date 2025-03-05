import java.util.ArrayList;
public class PairSum1 {
    static void brutForce(ArrayList<Integer> list1,int key){
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i)+list1.get(j)==key){
                    System.out.print("("+list1.get(i)+","+list1.get(j)+")");
                } 
            } 
            System.out.println();
        }
    }
    static void twoPointer(ArrayList<Integer> list1,int key){
        int lp=0, rp=list1.size()-1;
        for(int i=0;i<list1.size();i++){
            while (lp<rp) {
                if(list1.get(lp)+list1.get(rp)==key){
                    System.out.print("("+list1.get(lp)+","+list1.get(rp)+")\n");
                    lp++;
                }else if(list1.get(lp)+list1.get(rp)>key){
                    rp--;
                }else{
                    lp++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=6;i++){
            list.add(i);
        }
        System.out.println(list);
        int key  =5;
        twoPointer(list,key);
    }
}
