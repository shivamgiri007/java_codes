public class InvertedhalfPyramidNumbers {
    public static void main(String[] args) {
                // 12345
                // 1234
                // 123
                // 12
                // 1
        int a = 5;
        for(int i=0;i<a;i++){
            int b = 1;
            for(int j=0;j<a-i;j++){
                System.out.print(b);
                b++;
            }
            System.out.println();
            
        }
    }
}
