public class plimdrom {
    public static void isPalimdrome(int a){
        int rev = 0, b=a;
        while (b>0) {
            rev=rev*10+(b%10);
            b=b/10;
        }
        if(a==rev){
            System.out.println("PALIMDROME");
        }else{
            System.out.println("NOT PALIMDROME");
        }
    }
    public static void main(String[] args) {
        int number=21432;
        isPalimdrome(number);
    }
}
