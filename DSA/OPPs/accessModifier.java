public class accessModifier {
    public static void main(String[] args) {
        BankAccount A1 = new BankAccount();
        A1.username = "Jaydip";
        A1.setPass(234);
    }
}

class BankAccount{
    String username;
    // private int password=35426; //We cant access/print outside the class
    void setPass(int newPass){
        // password = newPass;
    }
}
