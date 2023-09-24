import java.util.*;
public class PrimeNumberOptimised{
    public static boolean checkPrime(int a){
        if(a == 0 || a == 1){
            return false;
        }
        if(a==2){
            return true;
        }
    
        for(int i=2;i<(a/2)+1;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5};
        for(int j=0;j< a.length ;j++){
            if(checkPrime(a[j])){
                System.out.println(a[j] + " is Prime Number.");
            }
            else{
                System.out.println(a[j] + " is not a prime number.");
            }
        }
    }
}