import java.util.*;
public class p1to100{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=1;
        int n = sc.nextInt();
        while (i<=n) {
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
}