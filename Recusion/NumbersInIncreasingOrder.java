public class NumbersInIncreasingOrder {
    public static void toIncrease(int a){
        
        if(a==0){
            return;
        }
        toIncrease(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a = 8;
        toIncrease(a);
    }
}
