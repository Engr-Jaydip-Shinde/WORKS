import java.util.*;
public class oddEvenSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,evensum=0,oddsum=0,choice;
        do{
            System.out.print("Enter the Number: ");
            num = sc.nextInt();
            if (num%2==0) {
                evensum =evensum + num;
            }else{
                oddsum+=num;
            }
            System.out.print("Enter 1 for continue and 0 for exit: ");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.print("Odd Sum : " + oddsum);
        System.out.print("\nEven Sum : " + evensum);
        sc.close();
    }
}