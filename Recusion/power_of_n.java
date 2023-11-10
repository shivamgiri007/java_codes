public class power_of_n {
    public static int power(int base , int pow){
        if(pow==1){
            return base;
        }
        return base * power(base,pow-1); 
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
