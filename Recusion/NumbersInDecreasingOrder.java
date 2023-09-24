public class NumbersInDecreasingOrder{
    public static void printDesc(int a){
        if(a == 0){
            return;
        }
        System.out.println(a);
        printDesc(a-1);
    }
    public static void main(String[] args) {
        int a = 8;
        printDesc(a);
    }
}