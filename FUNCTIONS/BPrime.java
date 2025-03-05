public class BPrime {
    public static boolean isPrime(int a){
        for(int i=2;i<a;i++){
            if(a==2){
                return true;
            }
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = 20;
        int j=0;
        for(int i=2;i<=a;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                j++;
            }else{
                continue;
            }
        }
        System.out.println("\nTotal Primes: "+j);
    }
}
