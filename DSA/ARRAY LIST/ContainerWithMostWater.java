import java.util.ArrayList;
public class ContainerWithMostWater {
    static void brutForce(ArrayList<Integer> list, int ar){
        for(int i=0;i<list.size();i++){//n^2
            for(int j=i+1;j<list.size();j++){
               int newar=(j-i)*Math.min(list.get(i), list.get(j));
               ar=Math.max(ar, newar);
            }
        }
        System.out.println(ar);
    }

    static void twoPointer(ArrayList<Integer> list2){
        int area1=0, lp=0, rp=list2.size()-1;
        for(int i=0; i<list2.size();i++){
            while (lp<rp) {
                int area2 = Math.min(list2.get(lp), list2.get(rp))*(rp-lp);
                if(list2.get(lp)<list2.get(rp)){
                    lp++;
                }else{
                    rp--;
                }
                area1=Math.max(area1, area2);
            }
        }
        System.out.println(area1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(8);list.add(6);
        list.add(2);list.add(5);list.add(4);
        list.add(8);list.add(3);list.add(7);
        int area = 0;
        brutForce(list, area);
        twoPointer(list);
    }
}
