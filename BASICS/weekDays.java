import java.util.*;
public class weekDays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week Number :");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("INVALID INPUT .");
                break;
        }
        sc.close();
    }    
}
