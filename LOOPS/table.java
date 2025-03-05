import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int NO = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(NO+" * "+i+" = "+(NO*i)+"\n");
        }
        sc.close();
    }
}
