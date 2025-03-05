import java.util.*;


public class funBasic {

    public  int sum(int a, int b){
        return a+b;
    }
    public  int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A, B, C : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        funBasic fb = new funBasic();
        int j1 = fb.sum(a,b);
        int j2 = fb.sum(a,b,c);
        System.out.print("Sum Of A, B : "+j1);
        System.out.print("\nSum Of A, B, C :"+j2);
        sc.close();
    }
}
