public class DecimalToBinary {
    public static int toBinary(int decimal){
        int binary = 0;
        int pow = 0;
        while(decimal>0){
            int reminder = decimal % 2;
            binary += reminder * (int)Math.pow(10, pow);
            pow++;
            decimal /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int decimal = 355 ;
        System.out.println("The binary of " + decimal + " is " + toBinary(355) + ".");
        
    }
}