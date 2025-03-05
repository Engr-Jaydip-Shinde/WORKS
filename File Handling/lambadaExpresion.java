public class lambadaExpresion {
    interface InnerlambadaExpresion {
        void add(int a,int b);
        
    }
    public static void main(String[] args) {
         // Using Lambda Expression
         InnerlambadaExpresion obj = (a, b) -> System.out.println(a + b);
         // Calling the method
         obj.add(10, 10);
    }
}
