public class sample {
    public static int printNum(int a){
        if( a == 0 ){
            return 1;
        }
        int fn = a * printNum(a-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(printNum(5));
    }
    
}
