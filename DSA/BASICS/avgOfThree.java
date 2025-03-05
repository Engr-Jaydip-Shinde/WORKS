import java.util.Scanner;
public class avgOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k;
        System.out.print("Enter three numbers : ");
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();
        int avg=(i+j+k)/3;
        System.out.println("Averag is : "+avg);
        sc.close();
    }
}
