public class power_of_no_optimised {
    public static int power(int base , int pow){
        if(pow==1){
            return base;
        }
        int halfpower = base * power(base,pow-1);
        return halfpower; 
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
