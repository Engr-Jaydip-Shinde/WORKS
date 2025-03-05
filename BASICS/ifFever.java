import java.util.Scanner;
public class ifFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature : ");
        float temp = sc.nextFloat();
        String fever = temp>100 ? "Fever" : "Not Fever";
        System.out.println(fever);
        sc.close();
    }
}
