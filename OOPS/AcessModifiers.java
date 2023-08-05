public class AcessModifiers {
    public static void main(String[] args) {
        //Access Modefiers = 
        // Private = within class 
        // Default = within class , within package 
        // Protected = within class , within package , outside package by subclass only. 
        // Public = within class , within package , outside package by subclass only ,outside package. 
        BankAccount b1 = new BankAccount();
        b1.username = "Shivam";
        // b1.password = "afaeghh";
        // This line shoes error because password is declared as private and cannot be accessed.
        b1.setPass("assghs");
        System.out.println(b1.password());
        // this method can set password only we cannot acces password directly because it is declared as protected
        
    }
    
}
class BankAccount{
    public String username;
    private String password;
    String password(){
        return this.password;
    }
    public void setPass(String pass){
        this.password = pass;
    }
}
