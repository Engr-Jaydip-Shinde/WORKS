public class evenCheck {
    public static boolean iseven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 10;
        System.out.println(iseven(number));
    }
}
