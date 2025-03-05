public class sumdigit {
    public static void sumOfDigit(int a){
        int sum = 0;
        while(a!=0){
            sum=sum+(a%10);
            a=a/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int number = 222222222;
        sumOfDigit(number);
    }
}
