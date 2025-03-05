import java.util.Scanner;

public class charectorPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i,j;
        char ch = 'A';
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
