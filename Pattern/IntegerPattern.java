public class IntegerPattern{
    public static void main(String[] args) {
        int rows = 9;
        int a = 0;
        for(int i=0;i<rows;i++){
            int temp = a;
            for(int j=0;j<i;j++){
                System.out.print(temp);
                temp = (temp + 1)%10;
            }
            a = (a + 1) % 10;
            System.out.println();
        }
    }
}