public class HalfPyramid{
    public static void main(String[] args) {
            // 1 
            // 1 2 
            // 1 2 3 
            // 1 2 3 4 
            // 1 2 3 4 5 
        int a = 5;
        for(int i =1;i<=a;i++){
            int b = 1;
            for(int j=0;j<i;j++){
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}