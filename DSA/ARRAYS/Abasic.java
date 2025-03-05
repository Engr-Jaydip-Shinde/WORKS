public class Abasic{
    public static void main(String[] args) {
        //Creation and input of elements in array
        int arr1[] = new int[5];
        char ovels[] = {'a','e','i','o','u'};
        System.out.println(ovels[1]);
        for( int i=0; i<5;i++){
            arr1[i]=i;
        }
        //Output of elements of array
        for(int i=0; i<5;i++){
            System.out.print(arr1[i] +" ");
        }
        System.out.println();
        //Updation + Output
        for(int i=0; i<5;i++){
            arr1[i]=arr1[i]+10;
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nsize of array : "+arr1.length);
    }
}
