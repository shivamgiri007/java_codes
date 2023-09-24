public class BinaryToDecimal {
    public static int toDecimal(int BinaryNumber){
        int pow = 0;
        int decimalNumber = 0;
        while(BinaryNumber>0){
            int lastNumber = BinaryNumber % 10;
            decimalNumber += (lastNumber * (int)Math.pow(2, pow));
            pow ++;
            BinaryNumber /= 10;
        }
        return decimalNumber;
    }
    public static void main(String[] args) {
        int BinaryNumber = 11011;
        System.out.println("The decimal value of " + BinaryNumber + " is " +  toDecimal(BinaryNumber));
    }
}
