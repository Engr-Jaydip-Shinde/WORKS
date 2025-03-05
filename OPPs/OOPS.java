public class OOPS {
    public static void main(String[] args) {
        // Animal A1 = new Animal();
        Birds B1 = new Birds();
        B1.breath();
        B1.fly();
    }
}
class Animal{
    String name;
    boolean veg;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Runs");
    }
    Animal(){
        System.out.println("Animal Constructor Called");
    }
}

class Birds extends Animal{
    Birds(){
        System.out.println("Birds Constructor Called");
    }
    void fly(){
        System.out.println("Flys");
    }
}
