import java.util.Scanner;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Number : ");
        int b = sc.nextInt();
        System.out.println("Your sum is : "+ (a+b));
        sc.close();
    }
}
