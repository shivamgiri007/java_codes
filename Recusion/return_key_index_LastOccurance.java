public class return_key_index_LastOccurance {
    public static int kIndex(int[] arr , int key , int i){ 
        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
        return kIndex(arr , key , i-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,5,8,5};
        System.out.println(kIndex(arr , 5 , arr.length-1));
    }
}
