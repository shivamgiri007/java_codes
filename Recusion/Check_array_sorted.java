public class Check_array_sorted {
    public static boolean sarray(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return (sarray(arr , i+1));
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,8};
        System.out.println(sarray(arr,0));
    }
}
