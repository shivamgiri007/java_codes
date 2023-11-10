public class return_key_index_firstOccurance {
    public static int kIndex(int[] arr , int key , int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return kIndex(arr , key , i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,5,8};
        System.out.println(kIndex(arr , 5 , 0));
    }
}
