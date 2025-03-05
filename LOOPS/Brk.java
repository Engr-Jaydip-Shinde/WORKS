import java.util.*;
public class Brk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number :");
            int num = sc.nextInt();
            if(num%10==0){
                System.out.println("You Entered Multiple of 10");
                break;
            }
        }
        sc.close();
    }
}

