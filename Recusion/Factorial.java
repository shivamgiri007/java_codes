        public class Factorial {
    public static int findFactorial(int a){
        if(a==1){
            return a;
        }
        int fact = a * findFactorial(a-1);
        return fact;
    }
    public static void main(String[] args) {
        int a = 8;
        System.out.println(findFactorial(a));
    }
}
