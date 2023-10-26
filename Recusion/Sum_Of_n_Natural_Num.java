public class Sum_Of_n_Natural_Num {
    public static int natural_sum(int a){
        if(a==1){
            return 1;
        }
        int sum = a + natural_sum(a-1);
        return sum;
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(natural_sum(a));
    }
}
