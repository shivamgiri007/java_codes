public class CharacterSideTrianglePattern {
    public static void main(String[] args) {
            // a 
            // b c 
            // d e f 
            // g h i j 
            // k l m n o 
        int a = 5;
        char b = 'a';
        for(int i =1;i<=a;i++){
            
            for(int j=0;j<i;j++){
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}
