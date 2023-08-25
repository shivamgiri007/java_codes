public class FloydsTriangle{
    public static void main(String[] args) {
                // 1 
                // 2 3 
                // 4 5 6 
                // 7 8 9 10 
                // 11 12 13 14 15 
        int a = 5;
        int b = 1;
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}