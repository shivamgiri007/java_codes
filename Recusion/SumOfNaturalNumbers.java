public class SumOfNaturalNumbers {
    public static int sNatural(int a){
        if(a ==1){
            return a;
        }
        int sum = a + sNatural(a-1);
        return sum;
    }
    public static void main(String[] args) {
        int a = 8;
        System.out.println(sNatural(a));
    }   
}
