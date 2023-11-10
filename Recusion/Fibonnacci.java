public class Fibonnacci {
    // Time complexity 2^n
    public static int fib(int a){
        if(a==0 || a==1){
            return a;
        }
        int fib = fib(a-1) + fib(a-2);
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fib(25));
    }
    
}
