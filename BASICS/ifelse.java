import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if (number<0) {
            System.out.println("NEGATIVE");
        }else if(number>0){
            System.out.println("POSITIVE");
        }else{
            System.out.println("ITs ZERO");
        }
        sc.close();
    }
    
}
