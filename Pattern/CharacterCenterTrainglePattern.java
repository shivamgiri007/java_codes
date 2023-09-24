public class CharacterCenterTrainglePattern {
    public static void main(String[] args) {
        char ch = 'a';
        for(int i=1;i<=5;i++){
            char temp = ch;
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(temp + " ");   
                temp++;
            }
            System.out.println();
            ch++;
        }
    }
}
