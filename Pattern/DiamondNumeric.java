public class DiamondNumeric  {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        for(int i=1;i<=a;i++){
            int c = b;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=a;j++){
                System.out.print(j + " ");
                c++;
            }
            System.out.println();
        }
        for(int i=a-1;i>=1;i--){
            int c = b;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=a;j++){
                System.out.print(j + " ");
                c++;
            }
            System.out.println();
        }
    }    
}
