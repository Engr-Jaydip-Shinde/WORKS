public class plimdrome {
    public static void main(String args[]){
        String str = "carrbac";
        int last = str.length()-1;
        boolean pal =true;
        for(int i=0; i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(last)){
                pal=false;
            }
            last=last-1;
        }
        if (pal) {
            System.out.println("PALIMDROME");
        }else{
            System.out.println("NOT PALIMDROME");
        }
    }
}
