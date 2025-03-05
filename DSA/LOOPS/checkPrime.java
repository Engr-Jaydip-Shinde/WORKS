public class checkPrime {
    public static void main(String[] args) {
        int n = 10 , div =2;
        
        while (true) {
            if(div<n){
            if(n%div==0){
                System.out.println("NOT PRIME");
                break;
            }else{
                div++;
            }
        }else{
            System.out.println("PRIME");
            break;
        }
        }
    }
}
