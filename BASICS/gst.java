import java.util.Scanner;
public class gst {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pen , pencile , eraser , gst;
        System.out.print("Enter the cost of pen : ");
        pen = sc.nextInt();
        System.out.print("Enter the cost of pencile : ");
        pencile = sc.nextInt();
        System.out.print("Enter the cost of eraser : ");
        eraser = sc.nextInt();
        gst = ((pen + pencile + eraser)*18)/100;
        System.out.println("Total Bill with 18% gst : "+((pen+pencile+eraser)+gst));
        sc.close();
    }
}
