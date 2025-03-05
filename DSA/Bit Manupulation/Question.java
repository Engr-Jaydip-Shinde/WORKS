public class Question {
    public static int clearIthBit(int n, int i){
        return (n>>i) & ~0;
    }

    public static int setIthBit(int n, int i){
        return (n>>i)|1;
    }

    public static int getIthBit(int n, int i){
        return (n>>i) & 1;
    }

    public static void oddEven(int n){
        if((n & 1 ) == 1){
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(clearIthBit(num,1));
        // 001
        // 010
        // 011
        // 100
        // 101
    }
}
