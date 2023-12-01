public class sample{
    public static int printNum(int a){
        if(a==0){
            return 0;
        }
        a = printNum(a-1);
        return a;
    }
    public static void main(String args[]){
        System.out.println(printNum(5));
    }
}