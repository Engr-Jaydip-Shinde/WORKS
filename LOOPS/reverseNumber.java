public class reverseNumber {
    public static void main(String[] args) {
        int num = 45356 , ld , rev=0 ;
        while(num>0){
            ld=num%10;
            rev = (rev*10)+ld;
            num=num/10;
        }
        System.out.println(rev);
    }
}
