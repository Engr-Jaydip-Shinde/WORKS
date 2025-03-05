public class prime{
    public static void primee(int a){
        boolean flag = true;
        if(a==2){
            System.out.println("PRIME");
        }
        for(int i=2;i<a;i++){
            if(a/i==0){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("PRIME");
        }else{
            System.out.println("NOT PRIME");
        }
    }
    public static void main(String[] args) {
        int a = 10;
        primee(a);
    }
    
}
